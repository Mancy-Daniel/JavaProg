import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorialOf(n));
        sc.close();
    }

    static int factorialOf(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = i * fact;
        }
        return fact;
    }
}
