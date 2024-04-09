import java.util.Scanner;

public class VotingSystem{
    private static String[] options = {"Modiji", "Pappu"}; // Initialize options for voting
    private static int[] voteCounts; // Array to store vote counts for each option

    public static void main(String[] args) {
        // Initialize voteCounts array with zeros
        voteCounts = new int[options.length];

        // Simulate voting process
        simulateVoting();

        // Calculate and display results
        calculateAndDisplayResults();
    }

    private static void simulateVoting() {
        Scanner scanner = new Scanner(System.in);

        // Simulate voting process for a fixed number of users
        System.out.println("Welcome to the Online Voting System!");
        System.out.println("Please select an option to vote for:");

    
        // Display options for voting
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }

        // Simulate voting for multiple users
        int numUsers = 5; // Change this to the desired number of users
        for (int i = 0; i < numUsers; i++) {
            System.out.println("\nUser " + (i + 1) + ":");
            System.out.print("Enter your choice (1-" + options.length + "): ");
            int selectedOptionIndex = scanner.nextInt() ; // Adjust index for array

            // Validate and process the vote
            if (selectedOptionIndex >= 0 && selectedOptionIndex < options.length) {
                voteCounts[selectedOptionIndex-1]++;
                System.out.println("Thank you for voting!");
            } else {
                System.out.println("Invalid option! Please select a valid option.");
                i--; // Decrement i to allow the user to vote again
            }
        }
    }

    private static void calculateAndDisplayResults() {
        // Calculate and display voting results
        System.out.println("\nVoting Results:");
        for (int i = 0; i < options.length; i++) {
            System.out.println(options[i] + ": " + voteCounts[i] + " votes");
        }
        // Additional logic for declaring the winner can be implemented here
    }
}