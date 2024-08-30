import java.util.*;

//num of Trailing zeros in a factorial
public class TrailingZeros {
    static int Zeros(int n) {
        int res = 0;
        int powOf5 = 5;
        while (n >= powOf5) {
            res = res + (n / powOf5);
            powOf5 = powOf5 * 5;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Factorial num:");
        int n = sc.nextInt();
        System.out.println(Zeros(n));

    }

}
