package org.example.oops;

class Account{
    private double balance; // Data hiding.
    // Now we will write getter and setter for the getBalance() and setBalance().

    // Getter and setter will return the value bit there can be more validation and more implementation before doing that.
    // We just only know that the method will return the value and internal validation we donot know.
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
}
public class oops4Encapsulation {
    public static void main(String[] args) {
        Account acc = new Account();
        // Directly we can not get the balance it is private. We have to use getBalance().
        acc.setBalance(1000000);
        System.out.println(acc.getBalance());// We have to get the balance through the method as it is private.
    }
}

