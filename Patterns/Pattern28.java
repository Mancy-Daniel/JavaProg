package Patterns;

public class Pattern28 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=2*n-1; i++){
            // for every row, run the col
            if(i<=5) {
                for (int j = 1; j <= n-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*" + " ");
                }
            }else{
                for (int j = 1; j <= i -n; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2*n - i; j++) {
                    System.out.print("*" + " ");
                }
            }
            // When one row is printed , we need to add newline
            System.out.println();
        }
    }
}
