import java.util.*;

public class factorial {
    static int fact(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = i * res;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        int n = sc.nextInt();
        System.out.println(fact(n));

    }

}
