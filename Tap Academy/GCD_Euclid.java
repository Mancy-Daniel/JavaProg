import java.util.Scanner;

public class GCD_Euclid {
    static int GCD(int a, int b) {
        int max = 0;
        while (a != b) {
            if (a > b) {
                max = a;
                max = max - b;
            } else {
                max = b;
                max = max - a;
            }
            return max;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First num:");
        int a = sc.nextInt();
        System.out.println("Enter the Second num:");
        int b = sc.nextInt();
        System.out.println(GCD(a, b));
    }
}