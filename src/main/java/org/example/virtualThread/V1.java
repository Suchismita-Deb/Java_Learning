package org.example.virtualThread;

public class V1 {
    public static void main(String[] args) {
        Thread thread = Thread.ofPlatform()
                .start(()-> System.out.println("Hello"));
    }
}
