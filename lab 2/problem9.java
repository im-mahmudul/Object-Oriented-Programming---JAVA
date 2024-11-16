import java.util.Scanner;
public class problem9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Celsius: ");
        double c = input.nextDouble();
        double fahrenheit = (9/5)* c + 32;
        System.out.print("fahrenheit: " + fahrenheit);
    }
}
