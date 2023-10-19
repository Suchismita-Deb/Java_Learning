package org.example.oops;
// Abstract class can contain abstract and concrete methods and we cannot create object of abstract class.
// Let's see how to achieve abstraction by using abstract class and interfaces.
// First create abstraction using interfaces then using abstract classes.

// Interface mobile and one class to implement the interface.

import java.util.ArrayList;

interface Mobile{
    public void calling(String number);

    public void sendMessage(String number);
    // There are two methods in the interface. Any class like Apple, Samsung which implement these interface should implement
    // these two methods.
}

class Apple implements Mobile{
    // This can override or inherit the functionality of Mobile.
    // Compiler will tell to implement the method from the interface.
    // We can also add other methods in the Apple class other than the unimplemented methods of the Mobile Interface.

    private ArrayList<String> contacts = new ArrayList<>();

    public void addContacts(String number){
        // This will add all the numbers to the list.
        contacts.add(number);
    }

    @Override
    public void calling(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void sendMessage(String message) {
        // We can take a list of contacts and pass the message to all of them.
        System.out.println("Sending the message " + message);
    }

}

public class oopsx3Abstraction {
    public static void main(String[] args) {
        //Creating object of the class.
        Apple myPhone = new Apple();
        myPhone.calling("8978787989");
        myPhone.sendMessage("Hello World.");
        myPhone.addContacts("7899878989");
        // This is how we achieve abstraction using interface.
        // At interface level we see the methods are abstract and both the methods implementation are hidden in the interface level.
        // Any class that will implement Mobile interface should use the blueprint of the interface.
        // Now we have achieved abstraction using interface.
    }
}
