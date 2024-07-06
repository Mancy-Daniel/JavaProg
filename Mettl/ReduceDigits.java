import java.util.Scanner;

//Reducing the digit by adding until it becomes Single digit
/*Eg:976592 
Process: 9+7+6+5+9+2=38
 * 3+8=11
 * 1+1=2   o/p:2
 */
public class ReduceDigits {
    static int ReduceDigitOf(int input1) {
        int a = input1;
        int sum = 0;
        if (input1 < 0) {
            a = input1 * (-1);
        }
        while (a > 9) {
            sum = 0;
            while (a > 0) {
                sum = sum + a % 10;
                a /= 10;
            }
            a = sum;
        }
        if (input1 < 0) {
            return -a;
        } else
            return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.println(ReduceDigitOf(input1));
    }

}
