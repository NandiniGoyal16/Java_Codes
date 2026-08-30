
public class recursion7 {
    static int fibonacci(int n) {
        if( n <= 1) {
            return n;
        }
        int last = fibonacci(n-1);
        int secLast = fibonacci(n-2);

        return last+secLast;
    }
    public static void main(String[] args) {
        int idx = 4;
        System.out.println("Fibonacci num at index " + idx + " is " + fibonacci(idx));
        
    }
    
}
