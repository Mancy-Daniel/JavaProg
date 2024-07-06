import java.util.Scanner;

//Finding the sum of digits of num 
public class SumOfDigits {
    static int SumOfDigitsOf(int input1) {
        int ans = 0;
        int num = input1;
        if (input1 > 0) {
            ans = num * (num + 1) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.println(SumOfDigitsOf(input1));
    }

}