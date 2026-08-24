public class recursion3 {
    static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Factorial of " + n + " " + "is: " + factorial(n));
    }
    
}
