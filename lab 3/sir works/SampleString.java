public class SampleString {
    public static void main(String[] args) {
        String str = "radar";
        String str1 = "";
        for(int i = str.length() - 1; i>=0; i--){
            str1 = str1 + str.charAt(i);
        }
        if(str.equals(str1)){ //strcmp(str, str1)
            System.out.println("Palindrome!");
        }
        else{
            System.out.println("Not palindrome!");
        }
    }
}
