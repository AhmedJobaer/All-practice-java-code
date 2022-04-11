/*
Jobaer Ahmed(1918243)
*/
package sem2;

import java.util.Scanner;

public class SelectionClass {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double number;
        
        System.out.print("Enter any number: ");
        number = input.nextDouble();
        
        double rand = Math.random();
        System.out.printf("Random number is : %.3f\n", rand);
        
        double result = number - rand;
        System.out.printf("Result: %.3f\n", result);
        
        if(result>50)
            System.out.println("Jobaer Ahmed");
        
    }
    
}
