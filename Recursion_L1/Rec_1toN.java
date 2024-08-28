package Recursion_L1;
// Q.2 print numbers from 1 to N
public class Rec_1toN {
    public static void main(String[] args) {
        int n = 5;
        tillN(n);
    }
    static void tillN(int n){
        if(n==0){
            return;
        }
        tillN(n-1);
        System.out.println(n);
    }
}
