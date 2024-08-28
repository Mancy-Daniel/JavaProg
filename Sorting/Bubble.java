package Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubbleSort(int[] arr){
        boolean swapped;
        // run the steps n-1 times
        for(int i=0; i< arr.length; i++){
            swapped = false;
            // for each step, max item will come at the last respective index
            for(int j = 1; j< arr.length-i; j++){
                // swap if the item is smaller than the previous item
                int k = j-1;
                if(arr[j] < arr[k]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                    swapped =  true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if(swapped = false){
                break;
            }
        }
    }
}
