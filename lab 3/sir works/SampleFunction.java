public class SampleFunction {
    public static boolean isPalindrome(String str){
        String str1 = "";
        for(int i = str.length() - 1; i>=0; i--){
            str1 = str1 + str.charAt(i);
        }
        if(str.equals(str1)){ 
            return true;
        }
        else{
            return false;
        }
        // return str.equals(str1);
    }
    public static String findMaxString(String sentance){
        String[] words = sentance.split(" ");
        String max = words[0];
        for(String s: words){
            if(s.length() > max.length()){
                max = s;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String str = "RADAR to OOP Lab";
        // String m = findMaxString(str);
        // boolean r = isPalindrome(m);
        System.out.println(isPalindrome(findMaxString(str)));
    }
}
