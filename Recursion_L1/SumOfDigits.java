package Recursion_L1;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 12888885;
        System.out.println(sum(n));
    }
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n%10 + sum(n/10);
    }
}
