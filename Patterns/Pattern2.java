package Patterns;
// Right Half Pyramid
public class Pattern2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n; i++) {
            // for every row, run the col
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            // When one row is printed , we need to add newline
            System.out.println();
        }
    }
}
