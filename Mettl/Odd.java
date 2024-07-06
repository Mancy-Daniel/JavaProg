import java.util.Scanner;

public class Odd {
    static int isOdd(int input1) {
        if (input1 % 2 != 0) {
            return 2;
        } else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.println(isOdd(input1));
    }

}
