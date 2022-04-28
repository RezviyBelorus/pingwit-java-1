package pingwit.lec_17.classwork.point_3;

import java.util.concurrent.Exchanger;

public class ExchangerMain {
    public static void main(String[] args) {
        Exchanger<String> ex = new Exchanger<>();

        ExchangerRunnable exchangerMain = new ExchangerRunnable(ex, "Hello");
        ExchangerRunnable exchangerMain_1 = new ExchangerRunnable(ex, "Privet");
        ExchangerRunnable exchangerMain_2 = new ExchangerRunnable(ex, "Ola");
        ExchangerRunnable exchangerMain_3 = new ExchangerRunnable(ex, "Cześć");

        new Thread(exchangerMain).start();
        new Thread(exchangerMain_1).start();
        new Thread(exchangerMain_2).start();
        new Thread(exchangerMain_3).start();
    }

}

class ExchangerRunnable implements Runnable {
    private final Exchanger<String> ex;
    private final String name;

    public ExchangerRunnable(Exchanger<String> ex, String name) {
        this.ex = ex;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            String exchange = ex.exchange(name);
            Thread.sleep(2000);
            System.out.println("Sent: " + name + "; Exchange: " + exchange);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
