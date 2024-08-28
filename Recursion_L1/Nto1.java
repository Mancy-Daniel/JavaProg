package Recursion_L1;
// Q.1 print the numbers N to 1
public class Nto1 {
    public static void main(String[] args) {
        int n = 5;
        FunNums(n);
    }
    static void FunNums(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        FunNums(n-1);
    }
}
