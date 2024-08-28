import java.util.Scanner;
class SecondUnitDig{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num>0){
            num = num%100;
            num=num/10;
        }
        System.out.println(num);
    }
}