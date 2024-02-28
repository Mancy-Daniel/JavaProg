public class EvenCount{
public static void main(String[] args){
int n=123456789;
int odd_count=0;
while(n>0){
int rem=n%10;
if(n%2==0){
odd_count++;
}
n=n/10;}
System.out.println("The odd count is:" +odd_count);
}}