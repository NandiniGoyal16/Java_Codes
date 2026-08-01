import java.util.*;

//--------- VEHICLE CLASS ---------
class Vehicle {
    private String myNumber;
    private VehicleType myType;

    public Vehicle(String s) {
        myNumber = s;

    } 

    public void setType(VehicleType vt) {
        this.myType = vt;
    }

    public VehicleType getTtype() {
        return myType;
    }
}

//--- ENUM CLASS VEHICLETYPE ----------
enum VehicleType {
    TWO_WHEELER_PARKINGLOT,
    FOURWHEELER_PARKINGLOT,
    LARGE_VEHICLE_PARKINGLOT;
}

//----- PARKING LOT CLASS ----------
abstract class ParkingLot {
    private String myID;
    private VehicleType myType;
    private boolean myIsFree = true;
    private Vehicle vehicle;

    public ParkingLot(VehicleType type) {
        myType = type;
    }

    public String getId() {
        return myID;
    }

    public void setVehicle(Vehicle v) {
        this.vehicle = v;
    }

    public VehicleType getType() {
        return myType;
    }

    public boolean isFree() {
        return myIsFree;
    }

    abstract public double getRate();

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setFree(boolean value) {
        myIsFree = value;
    }
}

//-----SUBCLASS 2-WHEELER PARKING LOT CLASS ----------
class TwoWheelerParkingLot extends ParkingLot {
    private static final double RATE = 20;

    public TwoWheelerParkingLot() {
        super(VehicleType.TWO_WHEELER_PARKINGLOT);
    }

    @Override
    public double getRate() {
        return RATE;
    }
}

//-----SUBCLASS 4-WHEELER PARKING LOT CLASS ----------
class FourWheelerParkingLot extends ParkingLot {
    private static final double RATE = 35;

    public FourWheelerParkingLot() {
        super(VehicleType.FOURWHEELER_PARKINGLOT);
    }

    @Override
    public double getRate() {
        return RATE;
    }
}

//-----SUBCLASS LARGE VEHICLE PARKING LOT CLASS ----------
class LargeVehicleParkingLot extends ParkingLot {
    private static final double RATE = 50;

    public LargeVehicleParkingLot() {
        super(VehicleType.LARGE_VEHICLE_PARKINGLOT);
    }

    @Override
    public double getRate() {
        return RATE;
    }
}

class ParkingZone {
    private Map<String, ParkingLot> myLots; 
    private String myName;
    private Map<VehicleType, List<String>> MyFreeLots;

    public ParkingZone() {
        myLots = new HashMap<>();
        MyFreeLots = new HashMap<>();
    }

    public void AddParkingLot(ParkingLot pl) {
        myLots.put(pl.getId(), pl);

        if(!MyFreeLots.containsKey(pl.getType())) {
            MyFreeLots.put(pl.getType(), new ArrayList<>());
        }   
        MyFreeLots.get(pl.getType()).add(pl.getId());
    }

    public ParkingLot getLot(String id) {
        return myLots.get(id);
    }

    public Map<VehicleType, List<String>> getFreelots() {
        return MyFreeLots;
    }
}

class ParkingManager {
    private List<ParkingZone> myZones;

    public String assignFreeLot(Vehicle v) {
        for(ParkingZone zone : myZones) {
            List<String> freeLots = zone.getFreelots().get(v.getTtype());
            if(freeLots.isEmpty()) {
                continue;
            }
            String freeLot = freeLots.get(freeLots.size()-1);
            freeLots.remove(freeLots.size()-1);

            zone.getLot(freeLot).setFree(false);

            return freeLot;
        }

        return null;
    }

    public boolean reclaimLot(String id) {
        for(ParkingZone z : myZones) {
            if(z.getLot(id) == null) {
                continue;
            }

            if(z.getLot(id).isFree()) {
                return false;
            }

            z.getLot(id).setFree(true);
            z.getFreelots().get(z.getLot(id).getType()).add(id);
            return true;
        }
        return false;
    }
}
class lld2 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("SparkGJ0484");
        Vehicle v2 = new Vehicle("JupiterGJ8765");

        
    }
}