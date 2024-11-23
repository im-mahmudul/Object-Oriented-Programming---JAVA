import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPositive = 0;
        int countNegative = 0;
        int total = 0;
        int totalCount = 0;

        System.out.println("Enter 10 integers (input 0 to end):");

        // Read 10 integers
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();

            // If the input is 0, terminate the loop
            if (number == 0) {
                break;
            }

            // Count positive and negative numbers
            if (number > 0) {
                countPositive++;
            } else if (number < 0) {
                countNegative++;
            }

            // Add the number to the total and increment the count (excluding zeros)
            total += number;
            totalCount++;
        }

        // Calculate average
        double average = totalCount > 0 ? (double) total / totalCount : 0.0;

        // Display the results
        System.out.println("Number of positive values: " + countPositive);
        System.out.println("Number of negative values: " + countNegative);
        System.out.println("Total of the input values (excluding zeros): " + total);
        System.out.printf("Average of the input values (excluding zeros): %.2f\n", average);
    }
}
