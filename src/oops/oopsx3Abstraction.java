package oops;
// Abstract class can contain abstract and concrete methods and we cannot create object of abstract class.
// Let's see how to achieve abstraction by using abstract class and interfaces.
// First create abstraction using interfaces then using abstract classes.

// Interface mobile and one class to implement the interface.

interface Mobile{
    public void calling(String number);

    public void sendMessage(String number);
    // There are two methods in the interface. Any class like Apple, Samsung which implement these interface should implement
    // these two methods.
}

class Apple implements Mobile{
    // This can override or inherit the functionality of Mobile.
    // Compiler will tell to implement the method from the interface.
    // We can also add other methods in the Apple class.

    @Override
    public void calling(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending the " + message);
    }

}

public class oopsx3Abstraction {

}
