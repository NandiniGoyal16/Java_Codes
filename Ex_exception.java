public class Ex_exception {
    public static void main(String[] args) {
        try{
            int x,y,z;
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            z = x/y;
            System.out.println("Value of Z=" +z);
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero");
        }
        catch(NumberFormatException e){
            System.out.println("not a number");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("enter a number");
        }
        finally{
            System.out.println("finally block");
        }
    }
    
}
