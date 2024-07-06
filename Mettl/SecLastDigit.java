import java.util.Scanner;

public class SecLastDigit {
    static int secLastDigitOf(int input1) {
        int ld = 0;
        if (input1 > 0) {
            ld = (input1 / 10) % 10;
        }
        return ld;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.println(secLastDigitOf(input1));
    }

}