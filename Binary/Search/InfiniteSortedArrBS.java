package Binary.Search;
// Q.link --> https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteSortedArrBS {
    public static void main(String[] args) {
        int[] arr ={3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));

    }
    static int ans(int[] arr, int target){
        //first find the range
        //first start with a box of size 2
        int start = 0;
        int end = 1;

        while(target > arr[end]){ // if the target is not in the start and end range, doubling the range.
            int tempstart = end + 1; //new start
            //double the box value
            //end = previousend + (sizeofbox) * 2;
            end = end + (end - start + 1) * 2;
            start = tempstart;
        }
        return BS(arr,target,start,end);
    }

    static int BS(int[] arr, int target, int start, int end){
        //int start = 0;
        //int end = arr.length-1
        while (start <= end) {
            // finds the middle index
            // int mid =  (start+end) might exceed the range of integer in java
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
