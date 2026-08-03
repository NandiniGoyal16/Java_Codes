import java.util.*;

public class findMax {
    public static int findMax(int[] arr) {
        int maxelement = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > maxelement) {
                maxelement = arr[i];
            }
        }
        return maxelement;
       
    }
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 23;
        array[1] = 50;
        array[2] = 3;
        array[3] = 63;
        array[4] = 13;

        System.out.println("Largest element in this array is: " + findMax(array));

        
    }
}
