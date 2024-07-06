import java.util.Scanner;

public class SumOfLD {
    static int secLastDigitOf(int input1, int input2) {
        int ld1 = 0;
        int ld2 = 0;
        if (input1 > 0 && input2 > 0) {
            ld1 = input1 % 10;
            ld2 = input2 % 10;
        }
        return ld1 + ld2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        System.out.println(secLastDigitOf(input1, input2));
    }

}