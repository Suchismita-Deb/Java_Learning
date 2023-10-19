package org.example.oops;

//Data Hiding is a technique to hide the internal object details like the data object or the data component.
//So that any outsiders cannot access the data directly.
//We achieve data hiding by making the attribute as private.

class Bank{
    private double balance = 100;
    private String userName = "SDEB";
    private String passWord = "passWoRd";
    // Now the members are private.
    // No one without validation cannot able to access the members.
    // Now the validation is in a function. It can be of specific logic like if the user wants to see the wallet balance.
    // Then the user should put same username and password.

    public double getWalletBalance(String username, String password){
        if(this.userName.equals(username) && this.passWord.equals(password)){
            // this with the parameter variable is giving error.
            // this goes with private variable declared in the class.
            return balance;
        }
        else{
            return 0.0;
        }
    }
}
public class oopsx1DataHiding {
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println(b.getWalletBalance("SDEB","passWoRd"));
    }
}
