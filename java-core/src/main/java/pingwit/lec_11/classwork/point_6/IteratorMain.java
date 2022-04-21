package pingwit.lec_11.classwork.point_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(2);
        integers.add(3);
        integers.add(3);

        System.out.println(integers);
        Iterator<Integer> iterator = integers.iterator();

        while (iterator.hasNext()) {
            Integer next = iterator.next();

            if (next % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println(integers);


        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
    }
}
