import java.util.Scanner;
public class NumCompare {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Input is not a number. Please try again.");
            scanner.close();
            return; // Terminate the program
        }
        double firstNumber = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Input is not a number. Please try again.");
            scanner.close();
            return; // Terminate the program
        }
        double secondNumber = scanner.nextDouble();

        // Compare the two numbers
        if (firstNumber == secondNumber) {
            System.out.println("The numbers are equal.");
        } else {
            System.out.println("The numbers are not equal.");
            if (firstNumber < secondNumber) {
                System.out.println(firstNumber + " is less than " + secondNumber + ".");
            } else {
                System.out.println(secondNumber + " is less than " + firstNumber + ".");
            }
        }

        // Close the Scanner object
        scanner.close();
    }
}
