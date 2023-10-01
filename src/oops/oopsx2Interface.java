package oops;

// Abstraction is hiding the internal implementation.
// Abstraction in java is achieved by using abstract classes and interface.

// Abstract classes are classes with incomplete implementation.
// Abstract classes cannot be instantiated.
// It can have abstract and concrete methods.

// Interface is the blueprint of the class which specifies what the class must do (not how).
// It only have method declaration and not method implementation.
// All the methods are abstract and public by default.
// If Every method is abstract then the interface is called a Pure abstract class. Only till Java 1.7 version.
// After Java 1.8 version we can put default and static method in interface.
// From Java 1.9 we can also put private.

public interface oopsx2Interface {
    // Inside interface we can have data members.
    // Data members inside interface are always static final.
    static final String a = "static constant";
    // Not using any access modifiers. By default it is public.

    public void m1();
    public  int m2();// These are abstract method. We can do like this till Java 1.8

    static void m3(){}// Default and static we provide the implementation.
    // As for static method we donot need to create an object. We can use the class name and interface name to access those methods.
    default int m4(){return 0;}// These can be done from 1.9 static can also be accessed by writing interface name.
    // The implementation of the default method will be available to all the classes that are implementing this interface.


    // The class that are implementing those interface are required to give the implementation of m1 and m2 as there is no implementation.
    // We can write private to the static method but we cannot write private to the default method.

    private void m5(){}// No call using the interface can use the private method.
}


// Create a class which implement the methods.
class Test implements oopsx2Interface{
    // The compiler will tell to implement unimplemented methods. The abstract methods are unimplemented methods.
    // While implementing the interface we need to override the abstract method of the interface.
    // We can make this class abstract then we do not have to override the method. Then we need to implement the class again.
    @Override
    public void m1() {

    }

    @Override
    public int m2() {
        return 0;
    }
    // Interface is the blueprint of the class which has abstract methods along with default static, default and private methods.
}