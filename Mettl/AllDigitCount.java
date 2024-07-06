import java.util.Scanner;

public class AllDigitCount {
    static int AllDigitCountOf(int input1) {
        int count = 0;
        while (input1 > 0) {
            int ld = input1 % 10;
            count++;
            input1 = input1 / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.println(AllDigitCountOf(input1));
    }

}
