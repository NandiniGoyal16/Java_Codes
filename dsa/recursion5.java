
import java.util.*;

//reverse array usigng one pointer
public class recursion5 {
    static int[] reverseArray(int[] arr, int i, int n) {
        if( i >= n-i-1) {
            return arr;
        }
        else {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        return reverseArray(arr, i+1, n);

    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        int size = nums.length;
        System.out.println("reversed array: " + Arrays.toString(reverseArray(nums, 0, size)));
        
    }
    
}
