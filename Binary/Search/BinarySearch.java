package Binary.Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,8,9,10,15,18,19,20,22};
        int target = 10;
        System.out.println(BS(arr,target));
    }
    static int BS(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int ans = 0;
        while (start <= end) {
            // finds the middle index
            // int mid =  (start+end) might exceed the range of integer in java
            int mid = start + (end-start)/2;
            if(target < nums[mid]){
                end = mid-1;
            } else if (target > nums[mid]) {
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
