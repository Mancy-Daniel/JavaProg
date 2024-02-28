import java.util.Scanner;
class MultiTable {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        while(i<=20){
             System.out.println(num+"*"+i+"="+num*i);
             i++;
        }
       
    }
}