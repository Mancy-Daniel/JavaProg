package Binary.Search;
// Ceiling -> if there is no target in the arr, it returns the smallest number greater or equal to target.
public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {5,8,9,10,15,18,19,20,22};
        int target = 14;
        System.out.println(ceilingBS(arr,target));
    }
    static int ceilingBS(int[] arr, int target){

        //what if the target element is greater than the greatest element in array
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end-start/2);
            if(target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        // Returning start instead of mid to get the greatest element if the target is not found
        return start;
    }
}
