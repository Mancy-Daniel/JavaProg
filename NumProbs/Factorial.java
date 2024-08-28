import java.util.Scanner;
class Factorial {
    static int fact(int n){
        int res=1;
        for(int i = 1;i<=n;i++){
       res = res*i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        int n = sc.nextInt();
        System.out.println("The factorial of num is:");
        System.out.println(fact(n));
        
    }
}