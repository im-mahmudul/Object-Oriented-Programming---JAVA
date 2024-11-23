
// Write a Java program that reads ten integers from the console and determines how many positive and negative values
// have been read and computes the total and average of the input values (not counting zeros). Your program ends with the
// input 0. Display the average as a floating-point number
import java.util.*;

public class problem1 {
    public static void main(String[] args) {
        int total = 0;
        int countPositive = 0;
        int countNegative = 0;
        int totalCount = 0;

        Scanner input = new Scanner(System.in);
        int[] val = new int[10];

        System.out.println("Enter Integers");
        for (int i = 0; i < 10; i++) {
            val[i] = input.nextInt();
            if ( val[i] == 0) {
                break;
            }

            if( val[i] > 0 ){
                countPositive++;
            }
            else if ( val[i] < 0) {
                countNegative++;
            }
            total += val[i];
            totalCount++;
        }
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = val[i] + sum;
        }
        System.out.println("Total " + sum);

        double average = sum / totalCount;
        System.out.println("Average is " + average);

    }
}
