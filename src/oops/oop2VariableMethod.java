package oops;

class FanVariableObject{
    private boolean isOn; // This is a instance variable.
    // When it is public then it will be accessible outside the class.
    public boolean check = true;

    public static int staticVar;
    public void get(){
        staticVar++;
    }

    public void turnOn(){
        // Local variable.
        // Variable declared inside the method.
        int var =0;
        // We cannot use in access modifier in local variable it is already defined.

        isOn = true;
        System.out.println("Fan is on.");
    }

    public void turnOff(){
        //System.out.println(var); This is giving error.
        //Var is a local variable.
        isOn = false;
        System.out.println("Fan is off");
    }
}
public class oop2VariableMethod {
    //Class can have 3 type sof variable.
    //Instance variable, Local variable, Static variable.

    //Instance variable are defined inside the class and outside the methods.
    //Scope of these variable are inside the class, blocks or any constructors.
    //Initialised when we create an object and also for each object a ew copy of the variable is allocated.

    //Local variables are defined inside the methods, blocks or constructors.
    //Scope is limited to that particular method or block.
    //Initialised when we call the method.

    //Static variable or class variable is defined inside the class and outside the method with a static keyword.
    //Scope is inside the class and not to the object.
    //Initialised only once when the execution start unlike the instance variable which gets initialised every time we create an object.

    //Static variable are initialised before initialising the instance variable means when the execution starts.
    //For every object only one copy of the variable gets allocated to all the objects.
    //Only one copy of variable will be available for every object. So if any object operates on the static variable, the change will be available i the other object.
    public static void main(String[] args) {
        FanVariableObject f1 = new FanVariableObject();
        FanVariableObject f2 = new FanVariableObject();

        //Instance variable outside the class.
        System.out.println(f1.check);
        System.out.println(FanVariableObject.staticVar);
        System.out.println(f1.staticVar);

        //Calling get fr f1 and then checking the value of static variable for f2.
        f1.get();
        System.out.println(f2.staticVar);
        //The count is 1.
        //Changes made by any object in static variable is reflected in other object.
        //Changes made in instance variable in any object is not reflected in other object.

    }

}
