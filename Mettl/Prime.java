import java.util.Scanner;

public class Prime {
    static int isPrime(int input1) {
        for (int i = 2; i <= input1; i++) {
            if (input1 % i == 0) {
                return 2;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.println(isPrime(input1));
    }

}