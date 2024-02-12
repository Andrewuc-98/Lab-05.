import java.util.Scanner;
public class ShipCostCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the price of the item
        System.out.print("Enter the price of the item: $");
        double itemPrice = scanner.nextDouble();

        // Calculate the shipping cost
        double shippingCost;
        if (itemPrice >= 100.0) {
            shippingCost = 0.0; // Free shipping if item price is $100 or more
        } else {
            shippingCost = itemPrice * 0.02; // 2% of the item price for shipping
        }

        // Calculate the total price
        double totalPrice = itemPrice + shippingCost;

        // Output the shipping cost and total price
        System.out.println("Shipping cost: $" + shippingCost);
        System.out.println("Total price: $" + totalPrice);

        // Close the Scanner object
        scanner.close();
        }
    }