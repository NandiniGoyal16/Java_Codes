
public class recursion1 {
    static void sum(int i, int n, int currsum) {
        if(i > n) {
            System.out.println("CurrentSum = " + currsum);
            return;
        }
        sum(i+1, n, currsum+i);
    }

    public static void main(String[] args) {
        int n = 5;
        sum(1, n, 0);
    }
    
}
