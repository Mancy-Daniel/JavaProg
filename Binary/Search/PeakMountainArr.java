package Binary.Search;
// Q.Link --> https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
// Q.6
public class PeakMountainArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,3,2};
        System.out.println(Peak(arr));
    }
    static int Peak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid+1]){
                // mid is in ascending order of array
                // because we know that mid+1 element > mid element
                // this may be the ans, but look at left
                // this is why end != mid - 1
                start = mid + 1;
            }
            else{  // mid is in descending part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            }

            // finally both start and end will be in the largest number
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =
    }
}
