package Patterns;

public class Pattern30 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <=n; row++) {
            // for every row, run the col
            //space
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            //what to print
            for (int col = row; col >=1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            // When one row is printed , we need to add newline
            System.out.println();
        }
    }
}
