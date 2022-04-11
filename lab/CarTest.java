
package lab;


public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("myvi", "2012", 23000);
        Car car2 = new Car("saga", "2014", 33000);
        
        System.out.println("Car 1 price: " + car1.getPrice());
        System.out.println("Car 1 price: " + car2.getPrice());
        
        car1.setPrice(car1.getPrice() * 0.95);
        car2.setPrice(car2.getPrice() * 0.93);
        
        System.out.println("Car 1 price AD: " + car1.getPrice());
        System.out.println("Car 1 price AD: " + car2.getPrice());
        
        
    }
    
}
