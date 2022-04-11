
package lab;


public class Car {
    
    private String model;
    private String year;
    private double price;
    

    
    Car(String themodel, String theyear, double theprice){
        this.model = themodel;
        this.year = theyear;
        if (price>=0){
            this.price = theprice;
        }
        
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
      
            this.price = price;
        
    }
    
    
}
