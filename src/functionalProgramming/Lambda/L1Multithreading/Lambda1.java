package functionalProgramming.Lambda.L1Multithreading;

public class Lambda1 {
    public static void main(String[] args) {
        MyRunnables runnables = new MyRunnables();
        Thread t = new Thread(runnables);
        t.start();
    }
}
