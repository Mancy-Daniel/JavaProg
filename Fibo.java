import java.util.Scanner;
public class Fibo{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
int num=sc.nextInt();
int firstnum = 1;
int secondnum = 1;
int nextnum;
for(int i=1;i<=num;i++){
System.out.print(firstnum +", ");
nextnum = firstnum+secondnum;
firstnum = secondnum;
secondnum = nextnum;
}}}