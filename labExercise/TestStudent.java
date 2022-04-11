//1918243 - Ahmed Jobaer (S5)

package labExercise;

import java.util.Scanner;


public class TestStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Student s = new Student();
        
        System.out.print("Enter your CGPA: ");
        double Cgpa = input.nextDouble();
        
        s.setCGPA(Cgpa);
        System.out.println("Remark: " + s.getRemark());
        
    }
    
}
