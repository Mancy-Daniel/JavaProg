import java.util.*;

public class MaxvalArray {
    static int max(int[] arr) {
        int i;
        int maxval = arr[0];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }

    public static void main(String args[]) {
        int[] arr = { 2, 5, 4, 3, 2, 1 };
        System.out.println(max(arr));
    }
}
