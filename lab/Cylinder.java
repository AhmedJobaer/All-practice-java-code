
package lab;


public class Cylinder {
    
    double radius;
    double height;

    public Cylinder() {

    }
    
    public Cylinder(double radius, double height){
    
        this.height = height;
        this.radius = radius;
    }
    
    public double vol(){
        
        return Math.PI * radius * radius * height;
    
    }
    
    
}
