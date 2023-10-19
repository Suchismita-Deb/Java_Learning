package org.example.oops;

// We have seen the abstraction using the interface.
// Now we will see the abstraction using the abstract class.

import java.util.ArrayList;

abstract class Mobilee{
    // Inside abstract class we can provide both abstract and concrete method.
    abstract void calling(String number);
    abstract void sendMessage(String message);

    // We can also have concrete methods.
    ArrayList<String> list = new ArrayList<>();
    public void addContacts(String number){
        list.add(number);
    }
    // In the interface we have made this method inside the implementation class as it is a concrete method.
    // In abstract class we can add concrete method. We can add implementation to method in abstract class.
}

class Samsung extends Mobilee{

    @Override
    void calling(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    void sendMessage(String message) {
        System.out.println("Sending message " + message);
    }
    // Here we have not provided any implementation of the addContact concrete class.
    // We can override the method and add the changes. If we do not override it will inherit the method.
    // Samsung class inherit the Mobilee class.
}

public class oopsx3AbstractClass {
    public static void main(String[] args) {
        Samsung myPhone = new Samsung();
        myPhone.addContacts("7897897898");
        myPhone.calling("7897897898");
        myPhone.sendMessage("Hello");
    }
}
