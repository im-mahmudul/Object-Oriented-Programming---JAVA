import java.util.Scanner;
public class problem8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Total Kilometers: ");
        int a = input.nextInt();
        System.out.print("Enter Time in Minutes: ");
        int t = input.nextInt();
        System.out.print("Enter Time in Second after Minutes: ");
        int s = input.nextInt();

        double Final_Time = t/60 + s/3600;      //minutes to hours and seconds to hours2
        double distance = a*0.6;  // 1km = 0.6 mile
        double time = 0.7583;
        double avg_spd = distance / time;
        System.out.print("average speed " + avg_spd);
    }
}
