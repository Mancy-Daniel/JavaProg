import java.util.Scanner;

public class OddCount {
    static int OddCountOf(int input1, int input2, int input3, int input4, int input5) {
        int oc = 0;
        if (input1 % 2 != 0) {
            oc++;
        }
        if (input2 % 2 != 0) {
            oc++;
        }
        if (input3 % 2 != 0) {
            oc++;
        }
        if (input4 % 2 != 0) {
            oc++;
        }
        if (input5 % 2 != 0) {
            oc++;
        }
        return oc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int input4 = sc.nextInt();
        int input5 = sc.nextInt();
        System.out.println(OddCountOf(input1, input2, input3, input4, input5));
    }

}
