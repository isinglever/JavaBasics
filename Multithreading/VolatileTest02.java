public class VolatileTest02 {
    volatile int a = 0;
    public void add() {
        a++;
    }

    public static void main(String[] args) throws InterruptedException {
        final VolatileTest02 test = new VolatileTest02();
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    test.add();
                }
            }).start();
        }
        Thread.sleep(10000);
        System.out.println(test.a);
    }
}
