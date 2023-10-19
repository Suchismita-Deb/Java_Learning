package multithreading;

class EvenThread implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<10;i=i+2) {
            try {Thread.sleep(1000);} catch (Exception e) {}
            System.out.println(i);
        }
    }
}

class OddThread implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<10;i=i+2) {
            try {Thread.sleep(1000);} catch (Exception e) {}
            System.out.println(i);
        }
    }
}

public class ThreadT3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new OddThread());
        Thread t2 = new Thread(new EvenThread());
        t1.start();
        t2.start();
    }
}
