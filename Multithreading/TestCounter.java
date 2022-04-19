public class TestCounter {

    final static int LOOP = 1000;

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        Producer producer = new Producer(counter);
        Consumer consumer = new Consumer(counter);

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

        System.out.println(counter.getCount());

    }
}

class Consumer extends Thread {

    Counter counter;

    public Consumer(Counter counter) {
        this.counter = counter;
    }


    @Override
    public void run() {
        for (int j = 0; j < TestCounter.LOOP; j++) {
            counter.dec();
        }
    }
}

class Producer extends Thread {

    Counter counter;

    public Producer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < TestCounter.LOOP; ++i) {
            counter.add();
        }
    }
}