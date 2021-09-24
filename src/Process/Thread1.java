package Process;

public class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Hello");

    }

    public static void main(String[] args) {
        new Thread1().start();

    }
}
