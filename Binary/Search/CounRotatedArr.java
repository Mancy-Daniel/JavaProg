package Binary.Search;
// Q.Link --> https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class CounRotatedArr {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            // 4 cases over here
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if(nums[start] >= nums[mid]){
                end = mid - 1;
            }
            if(nums[start] < nums[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }
}
