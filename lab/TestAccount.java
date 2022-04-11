
package lab;

public class TestAccount {
    
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account(1122, 500);
        
        a1.setId(112233);
        a1.setBalance(40000);
        a1.deposit(5000);
        a1.withdraw(85);

        System.out.println("ID: " + a1.getId());
        System.out.println("Date: " + a1.getdateCreated());
        
    }
    
}
