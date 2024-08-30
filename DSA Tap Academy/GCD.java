import java.util.Scanner;

//Using BRUTE FORCE approach
public class GCD {
    static int GCDofab(int a, int b) {
        int min = 0;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First num:");
        int a = sc.nextInt();
        System.out.println("Enter the Second num:");
        int b = sc.nextInt();
        System.out.println(GCDofab(a, b));

    }

}
