
package sem2;

import javax.swing.JOptionPane;


public class SemtineValue {
    
    public static void main(String[] args) {
        
        String dataString = JOptionPane.showInputDialog("Enter an Integer value: \n(the program exits if input is 0)");
        int data = Integer.parseInt(dataString);
        int sum = 0;
        
        while(data != 0){
        
            sum += data;
            
            dataString = JOptionPane.showInputDialog("Enter an Integer value: \n(the program exits if input is 0)");
            data = Integer.parseInt(dataString);
            
        }
        JOptionPane.showMessageDialog(null,"the sum is: " + sum);
    
        
    }
    
}
