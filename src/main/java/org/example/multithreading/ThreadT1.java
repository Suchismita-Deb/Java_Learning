package org.example.multithreading;

class ThreadT11 extends Thread{
    public void run(){
        for(int i=0;i<5;i++) {
            System.out.println("Thread 1");
        }
        try {java.lang.Thread.sleep(500);} catch (Exception e) {}
    }
}

class ThreadT12 extends Thread{
    public void run(){
        for(int i=0;i<5;i++) {
            System.out.println("Thread 2");
        }
        try {
            java.lang.Thread.sleep(500);} catch (Exception e) {}
    }
}

public class ThreadT1 {
    public static void main(String[] args) {
        ThreadT11 t1 = new ThreadT11();
        ThreadT12 t2 = new ThreadT12();
//        t1.run();
//        t2.run();
        // The program will wait and run one by one. First the thread1 and then thread2.
        // We can make the thread work parallelly.
        // We have to start the thread.

        t1.start();
        t2.start();
        //It can print in any order.
        /*Thread 1
          Thread 2
          Thread 2
          Thread 2
          Thread 2
          Thread 2
          Thread 1
          Thread 1
          Thread 1
          Thread 1
        */
    }
}
