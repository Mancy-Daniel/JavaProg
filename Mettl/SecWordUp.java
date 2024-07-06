import java.util.Scanner;

/*If input1 is "Wipro Technologies Bangalore",
the function should return "TECHNOLOGIES"
If input1 is "Hello", the function should return "LESS"
NOTE 1: If Input1 is a sentence with less than 2 words, the function should return the word "LESS". */
public class SecWordUp {
    static String SecWordUpOf(String input1) {
        String l = "LESS";
        String[] arr = input1.split(" ");
        if (arr.length < 2) {
            return l;
        }
        return arr[1].toUpperCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        System.out.println(SecWordUpOf(input1));
    }

}