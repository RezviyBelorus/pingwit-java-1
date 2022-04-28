package pingwit.lec_17.classwork.point_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierMain {

    public static void main(String[] args) {
        int numWorkers = 5;
        int numberOfPartialResults = 10;

        List<List<Integer>> partialResults = Collections.synchronizedList(new ArrayList<>());

        AggregatorThread barrierAction = new AggregatorThread(numberOfPartialResults, numWorkers, partialResults);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(numWorkers, barrierAction);

        System.out.println("Spawning " + numWorkers
            + " worker threads to compute "
            + numberOfPartialResults + " partial results each");

        for (int i = 0; i < numWorkers; i++) {
            Thread worker = new Thread(new NumberCruncherThread(numberOfPartialResults, cyclicBarrier, partialResults));
            worker.setName("Thread " + i);
            worker.start();
        }
    }

}

class NumberCruncherThread implements Runnable {

    private final Random random = new Random();

    private final int numPartialResults;
    private final CyclicBarrier cyclicBarrier;
    private final List<List<Integer>> partialResults;

    public NumberCruncherThread(int numPartialResults, CyclicBarrier cyclicBarrier, List<List<Integer>> partialResults) {
        this.numPartialResults = numPartialResults;
        this.cyclicBarrier = cyclicBarrier;
        this.partialResults = partialResults;
    }

    @Override
    public void run() {
        String thisThreadName = Thread.currentThread().getName();
        List<Integer> partialResult = new ArrayList<>();

        // Crunch some numbers and store the partial result
        for (int i = 0; i < numPartialResults; i++) {
            Integer num = random.nextInt(10);
            System.out.println(thisThreadName + ": Crunching some numbers! Final result - " + num);

            partialResult.add(num);
        }

        partialResults.add(partialResult);

        try {
            System.out.println(thisThreadName + " waiting for others to reach barrier.");
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            // ...
        } catch (BrokenBarrierException e) {
            // ...
        }
    }

}

class AggregatorThread implements Runnable {

    private final int numPartialResults;
    private final int numWorkers;
    private final List<List<Integer>> partialResults;

    public AggregatorThread(int numPartialResults, int numWorkers, List<List<Integer>> partialResults) {
        this.numPartialResults = numPartialResults;
        this.numWorkers = numWorkers;
        this.partialResults = partialResults;
    }

    @Override
    public void run() {
        String thisThreadName = Thread.currentThread().getName();

        System.out.println(thisThreadName + ": Computing sum of " + numWorkers + " workers, having " + numPartialResults + " results each.");
        int sum = 0;

        for (List<Integer> threadResult : partialResults) {
            System.out.print("Adding ");
            System.out.println(threadResult);

            Integer listSum = threadResult.stream()
                .reduce(0, Integer::sum);

            sum += listSum;
        }
        System.out.println(thisThreadName + ": Final result = " + sum);
    }

}
