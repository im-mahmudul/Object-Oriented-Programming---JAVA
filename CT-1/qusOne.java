import java.util.*;
public class qusOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp = n;
        int r, sum = 0;
        while (n>0) {
            r=n%10;
            sum = (sum*10)+r;
            n = n/10;
        }
        if (temp == sum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}


