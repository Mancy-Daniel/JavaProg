import java.util.Scanner;

public class Fibonacci {
    static int NthFibonacci(int input1) {
        if (input1 == 0) {
            return 0;
        } else if (input1 == 1 || input1 == 2) {
            return 1;
        } else
            return NthFibonacci(input1 - 1) + NthFibonacci(input1 - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.println(NthFibonacci(input1));
    }

}