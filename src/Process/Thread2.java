package Process;

public class Thread2 implements Runnable{
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t2222222222");
        }
    }

    public static void main(String[] args) {
        Thread2 thread2 = new Thread2();
        Thread thread = new Thread(thread2);
        thread.start();
        while (true){
            System.out.println("t11111111111");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}