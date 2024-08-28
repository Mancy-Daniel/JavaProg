import java.util.*;
public class Descending
{
public static void main(String[] args)
{
int temp;
Scanner sc = new Scanner(System.in);
int arr_size = sc.nextInt();
int[] array = new int[arr_size];
System.out.println("The elements are:");
for(int i=0;i<arr_size;i++)
{
array[i]= sc.nextInt();
}

for(int l=0;l<arr_size;l++)
{
for( int j=l+1;j<arr_size;j++)
{
if(array[l]<array[j])
{
temp = array[l];
array[l]=array[j];
array[j]=temp;
}
}}
System.out.println(Arrays.toString(array));
}
}