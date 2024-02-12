import java.util.Scanner;
public class PartyAffiliation {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their party affiliation
        System.out.println("Choose your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Enter your choice: ");
        String choice = scanner.next();

        // Determine the corresponding response based on the user's choice
        String response;
        if (choice.equalsIgnoreCase("D")) {
            response = "Democratic Donkey";
        } else if (choice.equalsIgnoreCase("R")) {
            response = "Republican Elephant";
        } else if (choice.equalsIgnoreCase("I")) {
            response = "Independent Person";
        } else {
            response = "Other";
        }

        // Output the response
        System.out.println("You get a " + response + ".");

        // Close the Scanner object
        scanner.close();
    }
}
