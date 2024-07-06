import java.util.Scanner;

public class PalindromeStr {
    static boolean isPalindrome(String input1) {
        String rev = "";
        String str = input1.toLowerCase();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (rev.equals(str)) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        System.out.println(isPalindrome(input1));
    }

}