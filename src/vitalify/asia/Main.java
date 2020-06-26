package vitalify.asia;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        try {
            while (count.myThread.isAlive()) {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
            e.printStackTrace();
        }
        System.out.println("Main thread is run over");
    }

    public static class Count implements Runnable {
        Thread myThread;

        public Count() {
            myThread = new Thread(this, "my runnable thread");
            myThread.start();
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Printing the count " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
            System.out.println("myThread is run over");
        }
    }
}
