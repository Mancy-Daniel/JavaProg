import java.util.Scanner;

//using EUCLID'S appraoch
public class GCD_Euclid {
    static int GCD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
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