package pingwit.lec_16.classwork.point_2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        List<Future<String>> submittedTasks = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            Future<String> submit = executorService.submit(new MyCallable());
            submittedTasks.add(submit);
        }


        while (submittedTasks.size() > 0) {
            for (int i = 0; i < submittedTasks.size(); i++) {
                Future<String> futureResult = submittedTasks.get(i);

                if (futureResult.isDone()) {
                    System.out.println(futureResult.get());
                    submittedTasks.remove(futureResult);
                }
            }
        }

        executorService.shutdown();
//        executorService.shutdownNow();
        System.out.println("The end");
    }
}

class MyCallable implements Callable<String> {
    @Override
    public String call() throws InterruptedException {

        Thread.sleep(2000);

        String name = Thread.currentThread().getName();
//        System.out.println("MyCallable=" + name);

        return name;
    }

}
