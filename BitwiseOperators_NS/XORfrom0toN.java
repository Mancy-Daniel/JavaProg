package BitwiseOperators_NS;

public class XORfrom0toN {
    public static void main(String[] args) {
        int n = 7;
        if((n % 4) == 0){
            System.out.println(n);
        }
        else if((n % 4) == 1){
            System.out.println(1);
        }
        else if((n % 4) == 2){
            System.out.println(n+1);
        }
        else{
            System.out.println(0);
        }
    }
}
