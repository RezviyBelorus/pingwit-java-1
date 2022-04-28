package pingwit.lec_17.classwork.point_6;

import java.util.concurrent.CyclicBarrier;

public class FerryCyclicBarrierMain {
    public static void main(String[] args) throws InterruptedException {
        int numOfCars = 9;

        CyclicBarrier cyclicBarrier = new CyclicBarrier(numOfCars, new FerryBoat());

        for (int i = 0; i < numOfCars; i++) {
            Car car = new Car(cyclicBarrier, i);
            new Thread(car).start();

            Thread.sleep(400);
        }
    }

}

class FerryBoat implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(500);
            System.out.println("Паром переправил автомобили!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class Car implements Runnable {
    private final CyclicBarrier cyclicBarrier;
    private final int carNumber;

    public Car(CyclicBarrier cyclicBarrier, int carNumber) {
        this.cyclicBarrier = cyclicBarrier;
        this.carNumber = carNumber;
    }

    @Override
    public void run() {
        try {
            System.out.printf("Автомобиль №%d подъехал к паромной переправе.\n", carNumber);
            //Для указания потоку о том что он достиг барьера, нужно вызвать метод await()
            //После этого данный поток блокируется, и ждет пока остальные стороны достигнут барьера
            cyclicBarrier.await();
            System.out.printf("Автомобиль №%d продолжил движение.\n", carNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
