import java.util.Scanner;

//No.of Prime in range
public class PrimeinRange {
    static int PrimeRange(int input1, int input2) {
        int count = 0;
        int j;
        for (int i = input1; i <= input2; i++) {
            for (j = 2; j <= i; j++) {
                if (input1 % j == 0)
                    break;
            }
            if (input1 == j) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        System.out.println(PrimeRange(input1, input2));
    }

}
