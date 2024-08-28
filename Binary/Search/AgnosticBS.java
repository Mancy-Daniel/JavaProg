package Binary.Search;

public class AgnosticBS {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int target = 3;
        System.out.println(BS(arr,target));
    }
    static int BS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
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
