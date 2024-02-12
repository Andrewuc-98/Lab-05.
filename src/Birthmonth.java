import java.util.Scanner;
public class Birthmonth {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their birth month
        System.out.print("Enter your birth month (1 - 12): ");
        int birthMonth = scanner.nextInt();

        // Check if the entered value is within the range 1 - 12
        if (birthMonth >= 1 && birthMonth <= 12) {
            // If the value is in range, echo the input
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            // If the value is not in range, output an error message
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }

        // Close the Scanner object
        scanner.close();
    }
}
