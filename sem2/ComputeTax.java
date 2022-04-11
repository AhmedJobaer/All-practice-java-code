
package sem2;

import javax.swing.JOptionPane;


public class ComputeTax {

    public static void main(String[] args) {

        String statusString = JOptionPane.showInputDialog("Enter the filling status: \n" + "0 for single filler\n" + "1 for married jointly\n" + "2 for married separetly\n" + "3 for head of household");
        int status = Integer.parseInt(statusString);
        
    }

}
