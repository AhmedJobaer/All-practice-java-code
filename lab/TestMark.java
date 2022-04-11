
package lab;

import java.util.Scanner;


public class TestMark {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter mark: ");
        int marks = input.nextInt();
        
        Range r = new Range(marks);
        r.range(marks);
        
        Remark re = new Remark(marks);
        re.remark(marks);
    }
    
}
