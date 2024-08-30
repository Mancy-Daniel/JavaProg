import java.util.*;

public class SwapArray {
    static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 8, 66, 2 };
        swap(arr, 2, 3);
        System.out.print(Arrays.toString(arr));
    }
}
