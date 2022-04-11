
package sem2;

import javax.swing.JOptionPane;


public class ComputeChange {
    
    public static void main(String[] args) {
        
        String amountString = JOptionPane.showInputDialog("Enter an amount id double, for example 11.56: ");
        double amount = Double.parseDouble(amountString);
        
        int remamount = (int) (amount * 100);
        
        int numberOfDollars = remamount / 100;
        remamount = remamount % 100;
        
        int numberOfQuaters = remamount / 25;
        remamount = remamount % 25;
        
        int numberOfDimes = remamount / 10;
        remamount = remamount % 10;
        
       int numberOfNicles = remamount / 5;
       remamount = remamount % 5;
       
       int numberOfPenies = remamount;
       
       String output = "Your amount " + amount + " consits of:\n" + numberOfDollars + " dollars\n" + numberOfQuaters + " quaters\n" + numberOfDimes + " dimes\n" + numberOfNicles + " nickeles\n" + numberOfPenies + " panies"; 
        
       JOptionPane.showMessageDialog(null, output);
        
    }
}
