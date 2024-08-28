package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 50;
        System.out.println(fiboFormula(n));
    }
    static int fiboFormula(int n){
        // just for demo, use long instead
        return (int)Math.pow(((1+Math.sqrt(5))/2),n);
    }
    static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }
}
