import java.util.Scanner;

public class Palindrome {
    static int isPalindrome(int input1) {
        int temp = input1;
        int res = 0;
        while (temp > 0) {
            int ld = temp % 10;
            res = (res * 10) + ld;
            temp /= 10;
        }
        if (input1 == res) {
            return 2;
        } else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.println(isPalindrome(input1));
    }

}
