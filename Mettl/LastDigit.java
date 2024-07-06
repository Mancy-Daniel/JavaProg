import java.util.Scanner;

public class LastDigit {
    static int lastDigitOf(int input1) {
        int ld = 0;
        if (input1 > 0) {
            ld = input1 % 10;
        }
        return ld;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.println(lastDigitOf(input1));
    }

}
