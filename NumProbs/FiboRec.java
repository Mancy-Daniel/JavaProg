import java.util.Scanner;
class FiboRec{
    static int fibo(int n){
        if(n==1 || n==2){
            return 1; 
           }
      else{
            return fibo(n-1)+fibo(n-2);
       }
    }
    public static void main(String[] args) {
        System.out.println("Enter the num");
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        System.out.println("Fibonacci of num is:");
       System.out.println(fibo(n));
}}