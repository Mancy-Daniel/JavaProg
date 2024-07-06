import java.util.Scanner;

public class NExactmulOfM {
    static int isNExactmulOfM(int input1, int input2, int input3, int input, int input5) {
        if (input1 < 0) {
            input1 = input1 * (-1);
        }
        if (input1 % input2 == 0) {
            return 2;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int input4 = sc.nextInt();
        int input5 = sc.nextInt();
        System.out.println(isNExactmulOfM(input1, input2, input3, input4, input5));
    }

}
