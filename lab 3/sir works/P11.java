import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentance = input.nextLine();
        String[] words = sentance.split(" ");
        String max = words[0];
        for(String s: words){
            if(s.length() > max.length()){
                max = s;
            }
        }
        System.out.println("The max word is " + max);
    }
}
