package Binary.Search;
import java.util.Arrays;
// Q.1 in 2D array --> Matrix is sorted by
public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 37;
        System.out.println(Arrays.toString(Search(arr, target)));
    }
    static int[] Search(int[][] matrix, int target){
        int row = 0;
        int col = matrix[0].length-1;

        while(row < matrix.length && col >=0){
            if(target == matrix[row][col]){
                return new int[] {row,col};
            }
            if(matrix[row][col] < target ){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[] {-1,-1};
    }
}
