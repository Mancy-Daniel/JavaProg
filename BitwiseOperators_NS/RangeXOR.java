package BitwiseOperators_NS;

public class RangeXOR {
    public static void main(String[] args) {
        // Range xor for a, b = xor(b) ^ xor(a-1)
        int a = 3;
        int b = 9;
        int ans = XOR(b) ^ XOR(a-1);
        System.out.println(ans);

        //only for check, will give TLE(Time Limit Exceeds) for large numbers
        int ans2 = 0;
        for (int i = a; i <= b; i++) {
            ans2 = ans2 ^ i;
        }
        System.out.println(ans2);
    }
    static int XOR(int a){
        if( a % 4 == 0){
            return a;
        }
        if( a % 4 == 1){
            return 1;
        }
        if( a % 4 == 2){
            return a+1;
        }
        if( a % 4 == 3){
            return 0;
        }
        return 0;
    }
}
