package pingwit.lec_16.classwork.point_2;

import java.util.ArrayList;
import java.util.List;

public class RunnableMain {
    public static void main(String[] args) {
        Runnable myRunnable_1 = new MyRunnable();
        Runnable myRunnable_2 = new MyRunnable();

        Thread thread_1 = new Thread(myRunnable_1);
        Thread thread_2 = new Thread(myRunnable_2);

        thread_1.start();
        thread_2.start();

        System.out.println(" ");

        Runnable runnableLambda = () -> System.out.println("Hello from lambda");

        Thread threadLambda = new Thread(runnableLambda);
        threadLambda.start();
    }
}

class MyRunnable implements Runnable {

    private static final List<String> STUDENTS = new ArrayList<>();

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        Thread thread = Thread.currentThread();
//        thread.setName("Penguin-1");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
