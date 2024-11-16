import java.util.Scanner;
public class problem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of radius: ");
        double rad = input.nextDouble();
        //double rad = 5.5;
        double pie = 3.1415926535;
        double par = 2 * pie * rad;
        double area = pie * rad * rad;
        System.out.println("Perimeter =" + par );
        System.out.println("area =" + area);
     }
    
}
