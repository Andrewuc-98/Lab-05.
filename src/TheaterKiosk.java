import java.util.Scanner;
public class TheaterKiosk {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check if the user is 21 or older
        if (age >= 21) {
            // If the user is 21 or older, display a message about getting a wristband
            System.out.println("You get a wristband!");
        }

        // Close the Scanner object
        scanner.close();
    }
}
