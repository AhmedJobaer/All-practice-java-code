//1918243 - Ahmed Jobaer (S5)
package labExercise;

public class TestFan {

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        Fan fan3 = new Fan();

        fan2.setSpeed(fan2.FAST);
        fan2.setRadius(8);
        fan2.setColor("White");
        fan2.setOn(true);

        fan3.setSpeed(fan3.MEDIUM);
        fan3.setRadius(10);
        fan3.setColor("Green");
        fan3.setOn(false);

        System.out.println(fan1);
        System.out.println(fan2);
        System.out.println(fan3);
    }

}
