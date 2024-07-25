import java.util.Scanner;

public class Electricitybill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Reading
        System.out.print("Enter the number of units consumed: ");
        double units = scanner.nextDouble();

        // Rate Calculation
        double billAmount = calculateBill(units);

        // Output
        System.out.println("Total Electricity Bill: " + billAmount);
        scanner.close();
    }

    public static double calculateBill(double units) {
        double billAmount = 0.0;

        if (units <= 50) {
            billAmount = units * 0.50;
        } else if (units <= 150) {
            billAmount = (50 * 0.50) + ((units - 50) * 0.75);
        } else if (units <= 250) {
            billAmount = (50 * 0.50) + (100 * 0.75) + ((units - 150) * 1.20);
        } else {
            billAmount = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 250) * 1.50);
        }

        // Adding surcharge of 20%
        billAmount += billAmount * 0.20;

        return billAmount;
    }
}
