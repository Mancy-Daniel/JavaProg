import java.util.*;

public class CountDigitsStr {
    static void Countn(int n) {
        String num = Integer.toString(n);
        System.out.println(num.length());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Countn(n);

    }

}
