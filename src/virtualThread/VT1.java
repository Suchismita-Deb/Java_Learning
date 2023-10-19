package virtualThread;

public class VT1 {
    public static void main(String[] args) {
        Thread.ofPlatform()
                .start(() -> System.out.println("Platform Thread : " + Thread.currentThread()));
    }
}
