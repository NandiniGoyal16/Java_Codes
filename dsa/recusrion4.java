
import java.util.*;
public class recusrion4 {
    static int[] reverseArray(int[] arr, int l, int r) {
        if (l >= r) return arr;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        return reverseArray(arr, l+1, r-1);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int n = nums.length;
        System.out.println("Reversed array = " + Arrays.toString(reverseArray(nums, 0, n-1)));
    }

    
}
