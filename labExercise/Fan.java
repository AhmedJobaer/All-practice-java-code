//1918243 - Ahmed Jobaer (S5)
package labExercise;

public class Fan {

    final public short SLOW = 1;
    final public short MEDIUM = 2;
    final public short FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "Blue";
    }

    public String toString() {
        String s = "";
        s = color + " color fan with radius " + radius;
        if (on){
            String speeed = "";
            if(speed == SLOW) {
                speeed = "SLOW";
            }
            else if(speed == MEDIUM) {
                speeed = "MEDIUM";
            }
            else if(speed == FAST) {
                speeed = "FAST";
            }
            else{
                s = speeed + " speed " + s;
            }
        }
        else{
            s = s + ". Fan is off";
        }
        return s;
    }

}
