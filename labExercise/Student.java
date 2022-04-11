//1918243 - Ahmed Jobaer (S5)


package labExercise;

public class Student {
    
    private String remark;
    private double CGPA;

    public Student() {
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }   
    
    public String getRemark() {
        
        if(4.00>=CGPA && CGPA>=3.6)
            return remark = "Excellent";
        else if(3.6>CGPA && CGPA>=3.2)
            return remark = "Very Good";
        else if(3.2>CGPA && CGPA>2.8)
            return remark = "Good";
        else if(2.8>CGPA && CGPA>=2.4)
            return remark = "Average";
        else if(2.4>CGPA && CGPA>=2.0)
            return remark = "Just Passing";
        else if(CGPA<2.00)
            return remark = "Work harder";
        else
            return remark = "Invalid CGPA";
        
    }

 

     
    
    
}
