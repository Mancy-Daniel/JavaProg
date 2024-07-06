import java.util.Scanner;

public class NthPrime {
    static int NthPrimeOf(int input1) {
        int count = 0;
        int num = 0;
        int i;
        while (count < input1) {
            num = num + 1;
            for (i = 2; i <= num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (num == i) {
                count++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.println(NthPrimeOf(input1));
    }

}