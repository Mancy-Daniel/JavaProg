import java.util.Scanner;

//using GABRIEL'S approach
public class GCDGab {
    public class GCD_Euclid {
        static int GCD(int a, int b) {
            while (a != 0 && b != 0) {
                if (a > b) {
                    a = a % b;
                } else {
                    b = b % a;
                }
            }
            if (a > b) {
                return a;
            } else {
                return b;
            }
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
}