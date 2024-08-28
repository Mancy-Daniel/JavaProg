package Binary.Search;
// Q.2 in 2D array
import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60},
                {66, 70, 75, 80}
        };
        int target = 16;

        int[] result = search2(arr, target);
        System.out.println("Target found at: [" + result[0] + ", " + result[1] + "]");
    }

    static int[] search2(int[][] arr, int target) {
        int n = arr.length, m = arr[0].length;

        // Binary search on the last column to find the potential row
        int lb = 0, ub = n - 1, mid;
        while (lb < ub) {
            mid = lb + (ub - lb) / 2;

            if (arr[mid][m - 1] < target) {
                lb = mid + 1;
            } else if (arr[mid][m - 1] > target) {
                ub = mid;
            } else {
                return new int[] { mid, m - 1 };
            }
        }

        // Now lb == ub, so we search in that specific row
        int ind = binarySearch(arr[lb], target);
        if (ind != -1) {
            return new int[] { lb, ind };
        }
        return new int[] { -1, -1 }; // Target not found
    }

    // Helper function to perform binary search on a 1D array
    static int binarySearch(int[] row, int target) {
        int lb = 0, ub = row.length - 1, mid;

        while (lb <= ub) {
            mid = lb + (ub - lb) / 2;

            if (row[mid] == target) {
                return mid;
            } else if (row[mid] < target) {
                lb = mid + 1;
            } else {
                ub = mid - 1;
            }
        }

        return -1; // Target not found in the row
    }
}


