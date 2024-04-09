import java.util.Scanner;
public class VotingSystem{
    private static String[] options = {"India", "Pakistan"}; 
    private static int[] voteCounts;
    public static void main(String[] args) {
        voteCounts = new int[options.length];
        simulateVoting();
        calculateAndDisplayResults();
    }
    private static void simulateVoting() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Online Voting System!");
        System.out.println("Please select an option to vote for:");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        int numUsers = 5; 
        for (int i = 0; i < numUsers; i++) {
            System.out.println("\nUser " + (i + 1) + ":");
            System.out.print("Enter your choice (1-" + options.length + "): ");
            int selectedOption = sc.nextInt(); 
            if (selectedOption >= 0 && selectedOption < options.length) {
                voteCounts[selectedOption-1]++;
                System.out.println("Thank you for voting!");
            } else {
                System.out.println("Invalid option! Please select a valid option.");
                i--; 
            }
        }
    }
    private static void calculateAndDisplayResults() {
        System.out.println("\nVoting Results:");
        for (int i = 0; i < options.length; i++) {
            System.out.println(options[i] + ": " + voteCounts[i] + " votes");
        }
    }
}
