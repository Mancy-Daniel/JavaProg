package BitwiseOperators_NS;

public class NoOfDigits {
    public static void main(String[] args) {
        int n = 5; // n is the number you're analyzing.
        int b = 2; // b is the base you're using.
        int ans = (int)(Math.log(n) / (Math.log(b))) + 1; // formula for log of n in base b
        System.out.println((ans));

    }
}
