package pingwit.lec_16.classwork.point_6;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicMain {
    public static void main(String[] args) throws InterruptedException {
        MyAtomic myAtomic = new MyAtomic();
        MyAtomicRunnable myAtomicRunnable = new MyAtomicRunnable(myAtomic);

        Thread thread_1 = new Thread(myAtomicRunnable);
        Thread thread_2 = new Thread(myAtomicRunnable);
        Thread thread_3 = new Thread(myAtomicRunnable);

        thread_1.start();
        thread_2.start();
        thread_3.start();

        thread_1.join();
        thread_2.join();
        thread_3.join();

        System.out.println("Quantity=" + myAtomic.getAtomicInteger().get());
    }
}

class MyAtomicRunnable implements Runnable {

    private MyAtomic myAtomic;

    public MyAtomicRunnable(MyAtomic myAtomic) {
        this.myAtomic = myAtomic;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000_00; i++) {
            myAtomic.increment();
        }
    }

}

class MyAtomic {
    private AtomicInteger atomicInteger = new AtomicInteger();

    public void increment() {
        atomicInteger.incrementAndGet();
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }

}
