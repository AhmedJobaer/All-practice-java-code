
package sem2;

import javax.swing.JOptionPane;


public class ComputeLoan {
    public static void main(String[] args) {
        
        String annualInterestRateString = JOptionPane.showInputDialog("Enter yearrly interest rate, for example 8.25: ");
        double annualInterestRate = Double.parseDouble(annualInterestRateString);
        
        double monthlyInterestRate = annualInterestRate / 100;
        
        String numberOfYearString = JOptionPane.showInputDialog("Enter number of years as an integer,\nfor example 5: ");
        int numberOfYears = Integer.parseInt(numberOfYearString);
        
        String loanString = JOptionPane.showInputDialog("Enter Loan ammount, for example 100000.89: ");
        double loanAmount = Integer.parseInt(loanString);
        
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;
        
        monthlyPayment = (int)(monthlyPayment * 100) / 100.0;
        totalPayment = (int)(totalPayment * 100) / 100.0;
        
        String output = "The mothly payment is: " + monthlyPayment + "\nThe total payment is: " + totalPayment;
        
        JOptionPane.showMessageDialog(null, output);
        
        
        
        
    }
    
}
