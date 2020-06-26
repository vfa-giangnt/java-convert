package vitalify.asia;

public class Main {
    public static void main(String[] args) {
        /*MultithreadingDemo demo = new MultithreadingDemo();
        demo.start();*/

        Count count = new Count();
        try {
            while (count.isAlive()) {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
            e.printStackTrace();
        }
        System.out.println("Main thread run over");
    }

    public static class MultithreadingDemo extends Thread {
        @Override
        public void run() {
            System.out.println("My thread is in running state");
        }
    }

    public static class Count extends Thread {

        public Count() {
            super("My extending thread");
            System.out.println("Thread created => " + this);
            start();
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Printing count " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("My thread interrupted");
                e.printStackTrace();
            }
            System.out.println("Thread run is over");
        }
    }
}
