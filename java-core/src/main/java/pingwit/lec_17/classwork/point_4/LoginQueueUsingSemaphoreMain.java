package pingwit.lec_17.classwork.point_4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;

public class LoginQueueUsingSemaphoreMain {
    public static void main(String[] args) {
        int slots = 10;

        ExecutorService executorService = Executors.newFixedThreadPool(slots);

        LoginQueueUsingSemaphore loginQueue = new LoginQueueUsingSemaphore(slots);

        IntStream.range(0, slots)
            .forEach(user -> executorService.execute(loginQueue::tryLogin));

        executorService.shutdown();

        System.out.println(loginQueue.availableSlots());
        System.out.println(loginQueue.tryLogin());

        loginQueue.login();
    }

}

class LoginQueueUsingSemaphore {

    private final Semaphore semaphore;

    public LoginQueueUsingSemaphore(int slotLimit) {
        semaphore = new Semaphore(slotLimit);
    }

    boolean tryLogin() {
        return semaphore.tryAcquire();
    }

    void login() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void logout() {
        semaphore.release();
    }

    int availableSlots() {
        return semaphore.availablePermits();
    }

}
