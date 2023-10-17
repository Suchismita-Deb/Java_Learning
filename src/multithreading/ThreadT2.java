package multithreading;

class ThreadT21 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<5;i++)
            System.out.println(Thread.currentThread());
    }
}
class ThreadT22 implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<5;i++)
            System.out.println(Thread.currentThread());
    }
}

public class ThreadT2 {
    public static void main(String[] args) {
        ThreadT11 t1 = new ThreadT11();
        Thread t2 = new Thread(new ThreadT12());// Calling the Runnable thread.
        t1.start();
        t2.start();
    }
}
