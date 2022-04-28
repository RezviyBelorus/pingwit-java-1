package pingwit.lec_17.classwork.point_4;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        Bank prior = new Bank("Prior", semaphore, 1000_000);
        Bank mtb = new Bank("MTB", semaphore, 100);
        Bank belarusBank = new Bank("BelarusBank", semaphore, 1000);

        new Thread(prior).start();
        new Thread(mtb).start();
        new Thread(belarusBank).start();
    }

}

class Bank implements Runnable {
    private final String name;
    private final Semaphore semaphore;
    private final int sumOfTransaction;

    public Bank(String name, Semaphore semaphore, int sumOfTransaction) {
        this.name = name;
        this.semaphore = semaphore;
        this.sumOfTransaction = sumOfTransaction;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();

            System.out.printf("[%s] sum: %d%n", name, sumOfTransaction);
            Thread.sleep(2000);

            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
