package MathForDSA;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n = 20;
        FactorsOfnN3(n);
    }

    // O(n))
    static void FactorsOfnN(int n){
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    // O(sqrt(n))
    static void FactorsOfnN2(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                if(n/i == i){
                    System.out.println(i + " ");
                }
                else{
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }

    // in ascending order
    static void FactorsOfnN3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                if(n/i == i){
                    System.out.println(i + " ");
                }
                else{
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0 ; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
