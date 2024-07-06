import java.util.Scanner;

public class Factorial {
    static int isFactorial(int input1) {
        if (input1 == 0 || input1 == 1) {
            return 1;
        } else
            return input1 * isFactorial(input1 - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.println(isFactorial(input1));
    }

}