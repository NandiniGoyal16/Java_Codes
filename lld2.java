import java.util.*;

//--------- VEHICLE CLASS ---------
class Vehicle {
    private String myNumber;
    private VehicleType myType;
    // private ParkingZone parkingzone;
    private ParkingLot parkingLot;

    public Vehicle(String s) {
        myNumber = s;
    } 

    // public void setLot(ParkingZone pz) {
    //     parkingzone = pz;
    // }

    // public ParkingZone getLot() {
    //     return parkingzone;
    // }

    public void setType(VehicleType vt) {
        this.myType = vt;
    }

    public VehicleType getTtype() {
        return myType;
    }

    public String getName() {
        return myNumber;
    } 

    public void setParkingLot(ParkingLot pl) {
        parkingLot = pl;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
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

    public ParkingLot(VehicleType type, String id) {
        myType = type;
        myID = id;
    }

    public String getId() {
        return myID;
    }

    public void setVehicle(Vehicle v) {
        this.vehicle = v;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public VehicleType getType() {
        return myType;
    }

    public boolean isFree() {
        return myIsFree;
    }

    abstract public double getRate();

    public void setFree(boolean value) {
        myIsFree = value;
    }
}

//-----SUBCLASS 2-WHEELER PARKING LOT CLASS ----------
class TwoWheelerParkingLot extends ParkingLot {
    private static final double RATE = 20;

    public TwoWheelerParkingLot(String id) {
        super(VehicleType.TWO_WHEELER_PARKINGLOT, id );
    }

    @Override
    public double getRate() {
        return RATE;
    }
}

//-----SUBCLASS 4-WHEELER PARKING LOT CLASS ----------
class FourWheelerParkingLot extends ParkingLot {
    private static final double RATE = 35;

    public FourWheelerParkingLot(String id) {
        super(VehicleType.FOURWHEELER_PARKINGLOT, id);
    }

    @Override
    public double getRate() {
        return RATE;
    }
}

//-----SUBCLASS LARGE VEHICLE PARKING LOT CLASS ----------
class LargeVehicleParkingLot extends ParkingLot {
    private static final double RATE = 50;

    public LargeVehicleParkingLot(String id) {
        super(VehicleType.LARGE_VEHICLE_PARKINGLOT, id);
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
   

    public ParkingZone(String name) {
        myLots = new HashMap<>();
        MyFreeLots = new HashMap<>();
        myName = name;
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

    public ParkingManager() {
        myZones = new ArrayList<>();
    }

    public void addZone(ParkingZone zone) {
        myZones.add(zone);
    }

    public String assignFreeLot(Vehicle v) {
        for(ParkingZone zone : myZones) {
            List<String> freeLots = zone.getFreelots().get(v.getTtype());

            if ((v.getParkingLot() != null)) {
                System.out.println(v.getName() + " is already assigned to this lot: " + v.getParkingLot().getId());
                return null;   
            }

            if(freeLots == null || freeLots.isEmpty()) {
                continue;
            }
            String freeLot = freeLots.get(freeLots.size()-1);
            freeLots.remove(freeLots.size()-1);

            ParkingLot lot = zone.getLot(freeLot);
            lot.setFree(false);
            lot.setVehicle(v);
            v.setParkingLot(lot);

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

            Vehicle v = z.getLot(id).getVehicle();

            if(v != null) {
                v.setParkingLot(null);
                z.getLot(id).setVehicle(null);
            }
            z.getLot(id).setFree(true);;
      
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
        Vehicle v3 = new Vehicle("MonsterTruckRJ6890");
        Vehicle v4 = new Vehicle("TataHR7654");


        v1.setType(VehicleType.FOURWHEELER_PARKINGLOT);
        v2.setType(VehicleType.TWO_WHEELER_PARKINGLOT);
        v3.setType(VehicleType.LARGE_VEHICLE_PARKINGLOT);
        v4.setType(VehicleType.FOURWHEELER_PARKINGLOT);


        TwoWheelerParkingLot twoWhpl1 = new TwoWheelerParkingLot("A1");

        FourWheelerParkingLot fourWhpl1 = new FourWheelerParkingLot("A2");

        LargeVehicleParkingLot largeWhpl1 = new LargeVehicleParkingLot("A3");

        ParkingZone pz1 = new ParkingZone("A"); //Parking zone A - TWO WHEELERS
        ParkingZone pz2 = new ParkingZone("B"); //Parking zone B - FOUR WHEELERS
        ParkingZone pz3 = new ParkingZone("C"); //Parking zone C - LARGE WHEELERS

        pz1.AddParkingLot(twoWhpl1);
        pz2.AddParkingLot(fourWhpl1);
        pz3.AddParkingLot(largeWhpl1);

        ParkingManager pm = new ParkingManager();
        
        pm.addZone(pz1);
        pm.addZone(pz2);
        pm.addZone(pz3);


        String lot1 = pm.assignFreeLot(v1);
        String lot2 = pm.assignFreeLot(v2);
        String lot3 = pm.assignFreeLot(v3);
  
     
        System.out.println("Parking Lot Assigned to " + v1.getTtype() + ": " + v1.getName() + " -> " + lot1);
        System.out.println("Parking Lot Assigned to " + v2.getTtype() + ": " + v2.getName() + " -> " + lot2);
        System.out.println("Parking Lot Assigned to " + v3.getTtype() + ": " + v3.getName() + " -> " + lot3);
      

        pm.reclaimLot("A2");
        System.out.println(v1.getParkingLot());

        String lot4 = pm.assignFreeLot(v4);
        System.out.println("Parking Lot Assigned to " + v4.getTtype() + ": " + v4.getName() + " -> " + lot4);



  
            


      

    }
}