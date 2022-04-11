
package lab;

import java.util.Scanner;


public class TestCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cylinder c = new Cylinder();
        
        System.out.print("Enter radius: ");
        c.radius = input.nextDouble();
        System.out.print("Enter height: ");
        c.height = input.nextDouble();
        System.out.println("Vol " + c.vol());
        
       
        
        
        
    }
    
}
