import java.util.Scanner;
class SampleArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        //System.out.println("Enter integers: ");
        for(int i = 0; i<10; i++){
            nums[i] = 100 + (int)(Math.random()*400); //scanf("%d", &nums[i])
        }
        System.out.println("The numbsers are: ");
        for(int a : nums){
            System.out.print(a + " ");
        }
        // for(int i = 0; i<10; i++){
        //     System.out.print( nums[i] + " ");
        // }
        
    }
}