package Binary.Search;
// Floor -> if there is no target in the arr, it returns the greatest number smaller or equal to target.
public class Floor {
    public static void main(String[] args) {
        int[] arr = {5,8,9,10,15,18,19,20,22};
        int target = 10;
        System.out.println(floorBS(arr,target));
    }
    static int floorBS(int[] arr, int target){
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
        return end; // return end for floor program
    }
}
