import java.util.Scanner;
public class Greatestof3{
public static void main(String[] args){

Scanner s1 = new Scanner(System.in);
System.out.println("Enter num a:");
int a = s1.nextInt();
System.out.println("Enter num b:");
int b = s1.nextInt();
System.out.println("Enter num c:");
int c = s1.nextInt();
if(a>b && a>c){
System.out.println("a is greater" +a);
}
else if(b>c && b>a){
System.out.println("b is greater" +b);
}else{
System.out.println("c is greater" +c);
}
}
}



