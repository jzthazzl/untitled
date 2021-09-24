package Process;

public class Thread3 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("t111111");
                }
            }
        }).start();

    }

}
