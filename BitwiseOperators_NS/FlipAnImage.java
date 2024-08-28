package BitwiseOperators_NS;

import java.util.Arrays;

public class FlipAnImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] result = flipAndInvertImage(image);
        // Print the result
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length;i++){
            int start = 0;
            int end = image[i].length-1;
            while(start <= end){
                // Swap and invert the start and end elements
                int temp = image[i][start] ^ 1;
                image[i][start] = image[i][end] ^ 1;
                image[i][end] = temp;
                start++;
                end--;
            }
        }
        return image;
    }
}
