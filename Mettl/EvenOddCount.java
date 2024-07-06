import java.util.Scanner;

public class EvenOddCount {
    static int EvenOddCountOf(int input1, int input2, int input3, int input4, int input5, String input6) {
        int count = 0;
        if (input6.equals("odd")) {
            if (input1 % 2 == 0) {
                count++;
            }
            if (input2 % 2 == 0) {
                count++;
            }
            if (input3 % 2 == 0) {
                count++;
            }
            if (input4 % 2 == 0) {
                count++;
            }
            if (input5 % 2 == 0) {
                count++;
            }
        }
        if (input6.equals("Odd")) {
            if (input1 % 2 != 0) {
                count++;
            }
            if (input2 % 2 != 0) {
                count++;
            }
            if (input3 % 2 != 0) {
                count++;
            }
            if (input4 % 2 != 0) {
                count++;
            }
            if (input5 % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int input4 = sc.nextInt();
        int input5 = sc.nextInt();
        String input6 = sc.nextLine();
        System.out.println(EvenOddCountOf(input1, input2, input3, input4, input5, input6));
    }

}
