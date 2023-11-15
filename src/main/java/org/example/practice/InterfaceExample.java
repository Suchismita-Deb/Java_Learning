package org.example.practice;

interface I {
    int i=10; // They are public static final. We will not able to change the value assigned to the variable(final).
    // Many class will be implementing the interface there will be conflict in the value.
    void display(); // They are public abstract.
    // Public access from all the classes. Abstract not implementing the method.
}
public class InterfaceExample implements I{
    @Override
    public void display() {
        System.out.println("The display method is updated.");
    }

    public static void main(String[] args) {
        I a = new InterfaceExample(); //Reference type variable for the interface. Instantiate with the interface implemented class.
        System.out.println("Interface");
        System.out.println(a.i);
    }
}
