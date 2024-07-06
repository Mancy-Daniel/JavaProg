import java.util.Scanner;

//SUm of the Even digits from the given Digit
/*Eg: 2134 
 * Process:1+3=4  o/p:4
 */
public class SumOfOdd {
    static int SumOfOddOf(int input1) {
        int res = 0;
        while (input1 > 0) {
            int ld = input1 % 10;
            if (ld % 2 != 0) {
                res = res + ld;
            }
            input1 /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.println(SumOfOddOf(input1));
    }

}
