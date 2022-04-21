package pingwit.lec_7.classwork.point_1;

import java.util.ArrayList;
import java.util.List;

public class MemoryModelMain {
    public static void main(String[] args) throws InterruptedException {
        String name = "Egorka";

        List<Integer> storage = new ArrayList<>();

        for (int i = 0; ; i++) {
            storage.add(i + i);

            Thread.sleep(10);
        }
    }

}
