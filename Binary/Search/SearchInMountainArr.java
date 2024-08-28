package Binary.Search;
// Q.Link -->
public class SearchInMountainArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,3,2};
        int target = 3;
        System.out.println(Search(arr,target));

    }
    static int Search(int[] arr, int target){
        int peak = Peak(arr);
        int start = 0;
        int end = arr.length-1;
        int firsTry = BS(arr,target,start,peak);
        if(firsTry != -1){
            return firsTry;
        }
        return BS(arr, target, peak+1,end);
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

    static int BS(int[] arr, int target,int start, int end){
        //int start = 0;
        //int end = arr.length-1;
        boolean isAsc;
        if(arr[start] < arr[end]){
            isAsc = true;
        }else {
            isAsc = false;
        }

        while (start <= end) {
            int mid = start + (end-start/2);
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }

        }
        return -1;
    }
}
