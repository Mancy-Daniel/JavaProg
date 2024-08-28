import java.util.Scanner;
public class Smallestof3{
public static void main(String[] args){
Scanner s1 = new Scanner(System.in);
System.out.println("Enter a:");
int a = s1.nextInt();
System.out.println("Enter b:");
int b = s1.nextInt();
System.out.println("Enter c:");
int c = s1.nextInt();
if(a<b && a<c){
System.out.println("Smallest num is a:"+a);
}
else if(b<a && b<c){
System.out.println("Smallest num is b:"+b);
}
else{
System.out.println("Smallest num is c:"+c);
}


}}
