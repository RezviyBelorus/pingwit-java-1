package pingwit.lec_17.classwork.point_5;

import java.util.List;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);

        System.out.println(countDownLatch.getCount());

        List<String> racers = List.of("Ejik", "Cherepaha", "Lisa", "Verblud");

        for (int i = 0; i < 4; i++) {
            Racer car = new Racer(racers.get(i), countDownLatch);

            new Thread(car).start();
        }

        Thread.sleep(1000);
        System.out.println("countDownLatch current count = " + countDownLatch.getCount());

        System.out.println("Preparing for start...");
        Thread.sleep(2000);
        System.out.println("Start!");

        countDownLatch.countDown();
        countDownLatch.countDown();
    }

}

class Racer implements Runnable {
    private final String name;
    private final CountDownLatch countDownLatch;

    public Racer(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            countDownLatch.countDown();
            System.out.printf("[%s] racer waiting!%n", name);
            countDownLatch.await();
            System.out.printf("[%s] racer moving!%n", name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

