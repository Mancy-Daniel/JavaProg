import java.util.Scanner;

/*If we Rearrange the digit to form a palindrome, if we can for apalindrome the return 2 else return 1 */
public class PalindromePossible {
    static int isPalindromePossible(int input1) {
        int count = 0;
        int[] arr = new int[10];
        while (input1 > 0) {
            int ld = input1 % 10;
            arr[ld]++;
            input1 /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        if (count > 1) {
            return 1;
        }
        return 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.println(isPalindromePossible(input1));
    }

}
