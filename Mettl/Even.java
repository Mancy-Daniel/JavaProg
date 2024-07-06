import java.util.Scanner;

public class Even {
    static int isEven(int input1) {
        if (input1 % 2 == 0) {
            return 2;
        } else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.println(isEven(input1));
    }

}
