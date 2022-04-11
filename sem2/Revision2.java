
package sem2;

import java.util.Scanner;


public class Revision2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number;
        number = input.nextInt();
        
        switch(number % 5){
        
            case 0: 
                System.out.println("Number is zero");
                break;
            case 1: 
                System.out.println("Number is 1");
                break;
            case 2: 
                System.out.println("Number is 2");
                break;
            case 3: 
                System.out.println("Number is 3");
                break;
            case 4: 
                System.out.println("Number is 4");
                break;
            default:
                System.out.println("Number dosent match");
            
        }
        
        System.out.println("Outsize the case");
        
    }
    
}
