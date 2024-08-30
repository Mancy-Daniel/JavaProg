import java.util.Scanner;

public class LCM {
    static int LCMofab(int a, int b) {
        int res = Math.max(a, b);
        while (true) {
            if (res % a == 0 && res % b == 0) {
                break;
            }
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First num:");
        int a = sc.nextInt();
        System.out.println("Enter the Second num:");
        int b = sc.nextInt();
        System.out.println(LCMofab(a, b));
    }
}