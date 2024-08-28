package Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <=n; i++) {
            // for every row, run the col
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*" + " ");
            }
            // When one row is printed , we need to add newline
            System.out.println();
        }
    }
}
