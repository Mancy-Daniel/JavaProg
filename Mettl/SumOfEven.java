import java.util.Scanner;

//SUm of the Even digits from the given Digit
/*Eg: 2134 
 * Process:2+6=8 o/p:8
 */
public class SumOfEven {
    static int SumOfEvenOf(int input1) {
        int res = 0;
        while (input1 > 0) {
            int ld = input1 % 10;
            if (ld % 2 == 0) {
                res = res + ld;
            }
            input1 /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.println(SumOfEvenOf(input1));
    }

}
