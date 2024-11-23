import java.util.*;
public class SampleArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[10];
        System.out.println("Enter Integers");
        for(int i = 0; i < 10; i++){
            num[i] = input.nextInt();
        }
        System.out.println("The Numbers are: ");
        for(int i = 0; i < 10; i++){
            System.out.printlm(num[i] + " ");
        }
        for( int a : num ){
            System.out.println( a + " ");
        }
    }
}