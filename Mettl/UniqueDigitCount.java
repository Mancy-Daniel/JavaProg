import java.util.Scanner;

//Finding the count for unique digits
public class UniqueDigitCount {
    static int UniqueDigitCountOf(int input1) {
        int count = 0;
        int arr[] = new int[10];
        while (input1 > 0) {
            int ld = input1 % 10;
            arr[ld]++;
            input1 /= 10;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.println(UniqueDigitCountOf(input1));
    }

}
