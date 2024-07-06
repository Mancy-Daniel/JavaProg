import java.util.Scanner;

public class EvenCount {
    static int EvenCountOf(int input1, int input2, int input3, int input4, int input5) {
        int ec = 0;
        if (input1 % 2 == 0) {
            ec++;
        }
        if (input2 % 2 == 0) {
            ec++;
        }
        if (input3 % 2 == 0) {
            ec++;
        }
        if (input4 % 2 == 0) {
            ec++;
        }
        if (input5 % 2 == 0) {
            ec++;
        }
        return ec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int input4 = sc.nextInt();
        int input5 = sc.nextInt();
        System.out.println(EvenCountOf(input1, input2, input3, input4, input5));
    }

}
