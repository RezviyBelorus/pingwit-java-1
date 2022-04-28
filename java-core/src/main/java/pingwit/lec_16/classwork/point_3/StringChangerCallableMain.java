package pingwit.lec_16.classwork.point_3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StringChangerCallableMain {
    public static void main(String[] args) throws InterruptedException {
        StringChanger stringChanger = new StringChanger();

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        StringChangerCallable stringChangerCallable = new StringChangerCallable(stringChanger);

        List<Callable<Integer>> tasks = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            tasks.add(stringChangerCallable);
        }

        executorService.invokeAll(tasks);
        executorService.shutdown();

        System.out.println("String=" + stringChanger.getString().length());
        System.out.println("StringBuilder=" + stringChanger.getStringBuilder().length());
        System.out.println("StringBuffer=" + stringChanger.getStringBuffer().length());
    }

}


class StringChangerCallable implements Callable<Integer> {
    private final StringChanger stringChanger;

    public StringChangerCallable(StringChanger stringChanger) {
        this.stringChanger = stringChanger;
    }

    @Override
    public Integer call() {
        for (int i = 0; i < 1000_0; i++) {
            stringChanger.addStringSpace();
            stringChanger.addBuilderSpace();
            stringChanger.addBufferSpace();
        }

        return 1;
    }

}
