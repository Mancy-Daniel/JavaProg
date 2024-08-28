package MathForDSA;

public class NewtonSqrt {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(NewtonRaphson(n));
    }
    static double NewtonRaphson(int n){
        double x = n;
        double root = 0.0;
        while(true){
            root = 0.5 * (x + (n/x));
            if(Math.abs(root - x) < 0.1){
                break;
            }
            x = root;
        }
        return root;
    }
}
