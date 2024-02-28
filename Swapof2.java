import java.util.Scanner;
public class Swapof2{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first num");
int a = sc.nextInt();
System.out.println("Enter the second num");
int b = sc.nextInt();
System.out.println("Before Swapping:" +a +" "+b);
int temp = a;
a=b;
b=temp;
System.out.println("After Swapping:" +a +" "+b);
}}