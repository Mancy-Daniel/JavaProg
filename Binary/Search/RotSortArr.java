package Binary.Search;
// Q.Link --> https://leetcode.com/problems/search-in-rotated-sorted-array/
// Q.8 & Q.9
public class RotSortArr {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 1;
        System.out.println(search(nums,target));
    }
    static int search(int[] nums,int target){
        int start =0;
        int end = nums.length-1;
        int pivot = findPivotDupicates(nums);
        // if you did not find a pivot, it means the array is not rotated
        if(pivot == -1){
            // just do normal binary search
            return BS(nums,target,start, end);
        }
        // if pivot is found, you have found 2 asc sorted arrays
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[start]){
            return BS(nums,target,start,pivot-1);
        }
        else{
            return BS(nums,target,pivot+1, end);
        }

    }
    static int BS(int[] nums, int target, int start, int end){
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

    // this will not work in duplicate values
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            // 4 cases over here
            if(mid <end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid=1;
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

    static int findPivotDupicates(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid <end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid=1;
            }
            //if elements at middle, start, end are equal then just skip the duplicates
            if(nums[start] == nums[mid] && nums[end] == nums[mid]){
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if(nums[start] > nums[start+1]){
                    return start;
                }
                start++;

                // check whether end is pivot
                if(nums[end] < nums[end-1]) {
                    return end - 1;
                }
                end--;
            } else if (nums[start] < nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end]) {
                start = mid + 1;
            }
            else{
                end = mid -1 ;
            }
        }
        return -1;
    }

}
