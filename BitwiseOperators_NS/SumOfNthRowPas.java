package BitwiseOperators_NS;
// find the sum of nth row in pascal's triangl
public class SumOfNthRowPas {
    public static void main(String[] args) {
        int n = 4; // You can change this value to test different rows
        int sum = sumOfNthRow(n);
        System.out.println("The sum of the " + n + "th row in Pascal's Triangle is: " + sum);
    }
    public static int sumOfNthRow(int n) {
        return (int) Math.pow(2, n);
    }
}
