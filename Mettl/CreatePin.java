import java.util.Scanner;

/*Eg: 
inp1 = 356 
inp2 = 598 
inp3 = 243 
PIN = 9243
- The PIN should be made up of 4 digits
- The unit (ones) position of the PIN should be the least of the units position of the three input numbers
- The tens position of the PIN should be the least of the tens position of the three input numbers
- The hundreds position of the PIN should be the least of the hundreds position of the three input numbers
- The thousands position of the PIN should be the maximum of all the digits in the three input numbers */
public class CreatePin {
    static int CreatePinOf(int input1, int input2, int input3) {
        int h1 = (input1 / 100) % 10;
        int t1 = (input1 / 10) % 10;
        int u1 = input1 % 10;
        int h2 = (input3 / 100) % 10;
        int t2 = (input3 / 10) % 10;
        int u2 = input3 % 10;
        int h3 = (input3 / 100) % 10;
        int t3 = (input3 / 10) % 10;
        int u3 = input3 % 10;
        int mh = Math.min((Math.min(h1, h2)), h3);
        int mt = Math.min((Math.min(t1, t2)), t3);
        int mu = Math.min((Math.min(u1, u2)), u3);
        int maxDigit = Math.max(Math.max(u1, Math.max(u2, u3)),
                Math.max(Math.max(t1, Math.max(t2, t3)),
                        Math.max(h1, Math.max(h2, h3))));
        return (maxDigit * 1000) + (mh * 100) + (mt * 10) + mu;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        System.out.println(CreatePinOf(input1, input2, input3));
    }

}
