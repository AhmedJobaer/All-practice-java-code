
package lab;

import java.util.Scanner;


public class Cgpa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("HoW many student? ");
        int num = input.nextInt();
        
        double[] cgpa = new double[num];
        
        double sum = 0;
        double minCgpa = 0, maxCgpa = 0;
        
        for (int i = 0; i < num; i++) {
            System.out.print("CGPA for student [" + (i +1) + "]:");
            cgpa[i] = input.nextInt();
            sum = sum + cgpa[i];
            
            if(i == 0){
                minCgpa = cgpa[i];
                maxCgpa = cgpa[i];
            }
            else{
                if(cgpa[i] > maxCgpa){
                    maxCgpa = cgpa[i];
                }
                 if(cgpa[i] < maxCgpa){
                    minCgpa = cgpa[i];
                }
            }
            
        }
        
        double average = sum / num;
        
        System.out.println("Average CGPA: " + average);
        System.out.println("Highest CGPA: " + maxCgpa);
        System.out.println("Lowest CGPA: " + minCgpa);
        
    }
    
}
