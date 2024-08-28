package Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n; i++) {
            // for every row, run the col
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // When one row is printed , we need to add newline
            System.out.println();
        }
    }
}
