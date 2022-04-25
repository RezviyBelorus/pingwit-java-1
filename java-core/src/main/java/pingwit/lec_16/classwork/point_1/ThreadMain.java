package pingwit.lec_16.classwork.point_1;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread();
        System.out.println("from main: " + mainThread.getName());

        MyThread myThread = new MyThread();
        System.out.println("myThread.isAlive()=" + myThread.isAlive());

        myThread.start();

        mainThread.interrupt();

        Thread.sleep(1000);

        System.out.println("after start isAlive()=" + myThread.isAlive());
        myThread.join();

        System.out.println("after join isAlive()=" + myThread.isAlive());

        System.out.println("Method main finished");
    }

}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from MyThread");

        Thread thread = Thread.currentThread();
        thread.setName("Penguin-1");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
