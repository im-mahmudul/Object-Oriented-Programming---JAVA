import javax.swing.*;

class gui13 {
    public static void main (String[] args){
        String input = JOptionPane.showInputDialog (null, "Welcome to exchange rate portal\n0. USD to BDT\n1. BDT to USD", "Money Exchange Rate ",JOptionPane.INFORMATION_MESSAGE);

        int info1 = Integer.parseInt(input);

        if ( info1 == 0 ) {
            String bdt = JOptionPane.showInputDialog(null, "Today's USD rate is 1$ = 119.59 Bangladeshi Taka\nEnter your amount here: ", "Money Exchange Rate ",JOptionPane.INFORMATION_MESSAGE);

            int con1 = Integer.parseInt(bdt);


            JOptionPane.showMessageDialog(null, "Your BDT amount is: " + (con1 * 119.59) + "৳", "Money Exchange Rate ", JOptionPane.INFORMATION_MESSAGE);


        }
        else if (info1 == 1) {
            String usd = JOptionPane.showInputDialog(null, "Today's BDT rate is 1৳ = 0.0084 United States Dollar", "Money Exchange Rate ", JOptionPane.INFORMATION_MESSAGE);

            int con2 = Integer.parseInt(usd);

            
            JOptionPane.showMessageDialog(null, "Your USD amount is: " + (con2 * 0.0084) + "$", "Money Exchange Rate ", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}