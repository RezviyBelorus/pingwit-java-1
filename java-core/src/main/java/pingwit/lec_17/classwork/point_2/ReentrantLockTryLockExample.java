package pingwit.lec_17.classwork.point_2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTryLockExample {
    public static void main(String[] args) throws InterruptedException {
        Garage garage = new Garage();

        Runnable runnable = () -> {
            for (int i = 0; i < 200_000; i++) {
                garage.park(i);
            }
        };

        Thread thread = new Thread(runnable);
        Thread thread_2 = new Thread(runnable);

        thread.start();
        thread_2.start();

        thread.join();
        thread_2.join();

        System.out.println("Result=" + garage.getCars().size());
    }

}

class Garage {
    private final List<Integer> cars = new ArrayList<>();

    private final ReentrantLock locker = new ReentrantLock();

    public void park(int number) {
        try {
            boolean isLocked = locker.tryLock(100, TimeUnit.MILLISECONDS);

            if (isLocked) {
                try {
                    cars.add(number);
                    System.out.println(number);
                } finally {
                    locker.unlock();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public List<Integer> getCars() {
        return cars;
    }

}
