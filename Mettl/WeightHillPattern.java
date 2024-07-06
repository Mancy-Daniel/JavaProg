import java.util.Scanner;

/*the total levels in the hill pattern = 5 (i.e. with 5 rows) 
the weight of the head level (first row) = 10 
the weight increments of each subsequent level = 2 
Then, The total weight of the hill pattern will be calculated as
 = 10 + (12+12) + (14+14+14) + (16+16+16+16) + (18+18+18+18+18) = 10 + 24 + 42 + 64 + 90 = 230 
+
+ +
+ + +
+ + + +
+ + + + + */
public class WeightHillPattern {
    static int WeightHillPatternOf(int input1, int input2, int input3) {
        int sum = 0;
        for (int i = 1; i <= input1; i++) {
            for (int j = 1; j <= i; j++) {
                sum = sum + input2;
            }
            input2 = input2 + input3;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        System.out.println(WeightHillPatternOf(input1, input2, input3));
    }

}
