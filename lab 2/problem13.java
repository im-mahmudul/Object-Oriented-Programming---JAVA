// Write a Java program that prompts the user to enter the exchange rate from currency in U.S. dollars (USD) to
// Bangladeshi Taka (BDT). Prompt the user to enter 0 to convert from USD to BDT and 1 to convert from BDT to USD.
// Then, prompt the user to enter the amount in USD or in BDT to convert it to BDT or USD, respectively. Use appropriate
// JOptionPane dialog boxes to read inputs and write outputs.

import java.util.Scanner;
public class problem13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to exchange rate portal");
        System.out.println("0. USD to BDT");
        System.out.println("1. BDT to USD");
        System.out.print("Reply: ");
        int ZeroOrOne = input.nextInt();

        if ( ZeroOrOne == 0) {
            System.out.println("Welcome to Money exchange rate portal.");
            System.err.println("Today's USD rate is 1$ = 119.59 Bangladeshi Taka");
            System.out.println("Enter your amount here: ");
            double amountDollars = input.nextDouble();
            double conversion1 = amountDollars * 119.59 ;
            System.out.println(amountDollars + " Dollars equals " + conversion1 +" Bangladeshi Taka ");
        }
        else if (ZeroOrOne == 1 ) {
            System.out.println("Welcome to Money exchange rate portal.");
            System.out.println("Today's BDT rate is 1৳ = 0.0084 United States Dollar");
            System.out.println("Enter your amount here: ");
            double amountTaka = input.nextDouble();
            double conversion2 = amountTaka * 0.0084 ; 
            System.out.println(amountTaka + "vTaka equals " + conversion2 + " United States Dollar ");

        }
    }
}
