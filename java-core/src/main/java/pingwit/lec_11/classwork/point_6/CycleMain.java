package pingwit.lec_11.classwork.point_6;

import java.util.ArrayList;
import java.util.List;

public class CycleMain {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(2);
        integers.add(3);
        integers.add(3);

        System.out.println(integers);

        for (int i = 0; i < integers.size(); i++) {
            Integer integer = integers.get(i);

            if (integer % 2 == 0) {
                integers.remove(i);
            }
        }

        System.out.println(integers);

        for (Integer integer : integers) {
            integers.add(integer);
        }

    }
}
