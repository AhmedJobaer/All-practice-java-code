
package lab;



public class Range {
    
    int marks;

    public Range(int marks) {
        this.marks = marks;
    }
    
    
    
    public void range(int marks){
    
        this.marks = marks;
        
        if(100>=marks && marks>=95)
           System.out.println("Grade is A");
        else if(94>=marks && marks>=75)
            System.out.println("Grade is B");
        else if(74>=marks && marks>=65)
            System.out.println("Grade is C");
        else if(64>=marks && marks>=50)
            System.out.println("Grade is D");
        else if(50>=marks )
            System.out.println("Grade is F");
        else
            System.out.println("Invaliv mark");
    }
    
}
