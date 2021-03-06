package pingwit.lec_16.classwork.point_3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class StringChangerMain {
    public static void main(String[] args) throws InterruptedException {
        StringChanger stringChanger = new StringChanger();

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        StringChangerRunnable stringChangerRunnable = new StringChangerRunnable(stringChanger);

        List<Future<?>> tasks = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Future<?> submit = executorService.submit(stringChangerRunnable);
            tasks.add(submit);
        }

        executorService.awaitTermination(5, TimeUnit.SECONDS);
        executorService.shutdown();

        System.out.println("String=" + stringChanger.getString().length());
        System.out.println("StringBuilder=" + stringChanger.getStringBuilder().length());
        System.out.println("StringBuffer=" + stringChanger.getStringBuffer().length());
    }

}


class StringChangerRunnable implements Runnable {
    private final StringChanger stringChanger;

    public StringChangerRunnable(StringChanger stringChanger) {
        this.stringChanger = stringChanger;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000_0; i++) {
            stringChanger.addStringSpace();
            stringChanger.addBuilderSpace();
            stringChanger.addBufferSpace();
        }
    }

}
