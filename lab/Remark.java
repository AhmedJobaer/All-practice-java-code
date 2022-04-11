
package lab;


public class Remark {
    
    int marks;

    public Remark(int marks) {
        this.marks = marks;
    }
    
    
    public void remark(int mark){
    
       
        
        if(100>=marks && marks>=95)
            System.out.println("Excellent");
        else if(94>=marks && marks>=75)
            System.out.println("Very good");
        else if(74>=marks && marks>=65)
            System.out.println("Not good");
        else if(64>=marks && marks>=50)
            System.out.println("Just Passing");
        else if(50>=marks )
            System.out.println("You are faild");
        else
            System.out.println("Invaliv mark");
        
    }
    
}
