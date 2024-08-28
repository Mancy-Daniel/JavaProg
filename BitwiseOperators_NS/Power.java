package BitwiseOperators_NS;

public class Power {
    public static void main(String[] args) {
        int n = 6;
        int base = 3;
        int ans = 1;
        while(n>0){
            if((n & 1) == 1){
                ans = ans * base;
            }
            base = base * base;
            n = n >> 1;
        }
        System.out.println(ans);
    }
}
