package pingwit.lec_16.classwork.point_4;

public class SynchronizedMain {
    public static void main(String[] args) throws InterruptedException {
        MyStorage myStorage = new MyStorage();
        MyStorageRunnable myStorageRunnable = new MyStorageRunnable(myStorage);

        Thread thread_1 = new Thread(myStorageRunnable);
        Thread thread_2 = new Thread(myStorageRunnable);
        Thread thread_3 = new Thread(myStorageRunnable);

        thread_1.start();
        thread_2.start();
        thread_3.start();

        thread_1.join();
        thread_2.join();
        thread_3.join();

        System.out.println("Quantity=" + myStorage.getQuantity());

    }

}


class MyStorageRunnable implements Runnable {

    private MyStorage myStorage;

    public MyStorageRunnable(MyStorage myStorage) {
        this.myStorage = myStorage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000_00; i++) {
            myStorage.incrementSynchronized();
            myStorage.incrementSynchronizedBlockThis();
            myStorage.incrementSynchronizedBlockClass();
        }
    }

}

class MyStorage {
    private int quantity = 0;

    private Object synchronizedObject = new Object();

    public synchronized void incrementSynchronized() {
        ++quantity;
    }

    public void incrementSynchronizedBlockThis() {
        System.out.println("Hello from this");

        synchronized (synchronizedObject) {
            ++quantity;
        }
    }

    public void incrementSynchronizedBlockClass() {
        synchronized (synchronizedObject) {
            ++quantity;
        }
    }

    public int getQuantity() {
        return quantity;
    }

}
