// Abstraction, encapsulation, inheritance, polymorphism

// class Theater {
//     private static final double BASE_PRICE
// }

// Parent class - seat's common functionality
abstract class Seat {
    private static final double BASE_PRICE = 500;
    private double price;
    private boolean isBooked;
    Customer myCustomer;
    Customer myAge;


   
    public Seat(double multiplier) {
        this.price = BASE_PRICE * multiplier;
    }
   
    public double getPrice()
    {
        return price;
    }
   
    public void book() {
        isBooked = true;
    }
   
    public boolean isBooked() {
        return isBooked;
    }
   
       
    abstract public String getColor();  

    public void setCustomer(Customer c) {
        myCustomer = c;
    }

    public Customer getCustomer() {
        return myCustomer;
    }

}

class EconomySeat extends Seat {
    public EconomySeat() {
        super(1);
    }
   
    @Override
    public String getColor() {
        return "grey";
    }

}

class Customer {
    private String CustomerName;
    private int CustomerAge;
    private Seat mySeat;

    public Customer(String csname, int csage) {
        this.CustomerName = csname;
        this.CustomerAge = csage;
    }

    public String GetName() {
        return CustomerName;
        
    }

    public int getAge() {
        return CustomerAge;
    }

    public void setSeat(Seat s) {
        mySeat = s;
    }

    public Seat getSeat() {
        return mySeat;
    }
}

class MidTierSeat extends Seat {
    public MidTierSeat() {
        super(1.5);
    }
   
    @Override
    public String getColor() {
        return "blue";
    }

}

class PremiumSeat extends Seat {
    private static final double LUXURY_FEES = 100;
   
    public PremiumSeat() {
        super(2);
    }
   
    // public double getPremiumPrice() {
    //     return getPrice() + LUXURY_FEES;
    // }
    @Override
    public double getPrice() {
        return super.getPrice() + LUXURY_FEES;
    }
   
    @Override
    public String getColor() {
        return "maroon";
    } 
}

// dynamic binding/dynamic dispatch/runtime binding
class BookingManager {
    public static boolean bookSeat(Seat seat, double paidAmount, Customer c) {
        // seat,getColor()

        if (seat.isBooked() || seat.getPrice() > paidAmount) {
            return false;
        }
        else {
            seat.book();
            System.out.println("Booked seat with color " + seat.getColor() + " just for you!" + "booked seat for customer: "+ c.GetName());

            seat.setCustomer(c);
            c.setSeat(seat);
            return true;
        }
    }

}

class lld {
    public static void main(String[] args) {
        MidTierSeat mts = new MidTierSeat();
        // s.book();
        // System.out.println(s.isBooked());
       
        // Seat mySeat = new Person();
       
        PremiumSeat ps = new PremiumSeat();
        // Seat s = new Seat(100);
        // EconomySeat es = new EconomySeat()
        // System.out.println(BookingManager.bookSeat(mts, 2000));


        // System.out.println(ps.getPrice());

        // Customer c1 = new Customer("abc", 23);
        // System.out.println("Customer Name: " + c1.getName() + "Age of Customer: " + c1.getAge() );

        Customer c1 = new Customer("fgds", 4545);

         System.out.println(BookingManager.bookSeat(mts, 2000, c1 ));
         System.out.println(mts.getCustomer().GetName());
          System.out.println(c1.getSeat().getColor());
    }
}