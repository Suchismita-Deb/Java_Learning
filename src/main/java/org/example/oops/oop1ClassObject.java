package org.example.oops;

class Fan{
    private boolean isOn;
    public void turnOn(){
        isOn=true;
        System.out.println("Fan is on");
    }
    public void turnOff(){
        isOn=false;
        System.out.println("Fan is stopped.");
    }
}

//ClassObject is one such class we can have another class.
// One java file can have more than one class.
public class oop1ClassObject {
    public static void main(String[] args) {
        System.out.println("HELLO");
        // We will create an object of Fan.
        Fan myFan = new Fan();
        myFan.turnOn();
        myFan.turnOff();
    }
}
// There can be more than one class in the file but the name of the file is same as the public class.
