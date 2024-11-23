import javax.swing.*;
class SampleDialogBox1 {
    public static void main (String[] args){
        String str1 = JOptionPane.showInputDialog (null, "Enter a number", 
            "Input Dialog",JOptionPane.QUESTION_MESSAGE);
        int n1 = Integer.parseInt(str1);
        String str2 = JOptionPane.showInputDialog (null, "Enter a number", 
            "Input Dialog",JOptionPane.QUESTION_MESSAGE);
        int n2 = Integer.parseInt(str2);
        JOptionPane.showMessageDialog(null,"The result is"+(n1+n2),
            "Output Dialog", JOptionPane.INFORMATION_MESSAGE);
    }
}