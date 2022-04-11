
package lab;

import java.util.Date;



public class Account {
    
    private int id = 0;
    private double balance = 0.0;
    private Date dateCreated;
    
    Account(){
         this.dateCreated = new Date();
    }
    
    Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }
    
    
    public Date getdateCreated(){
       return dateCreated;
    }
    

    public void withdraw(double amount){
        if (amount <= this.balance){
            this.balance = this.balance - amount;
        }
        
    }
    
    public void deposit(double amount){
      this.balance = this.balance + amount;
    }

    public void setId(int id){
        this.id = id;  
    }
    
    public int getId(){
        return id;
    }
    
    public void setBalance(double balance){
        this.balance = balance;    
    }

    public double getBalance() {
        return balance;
    }
        

    
    
}
