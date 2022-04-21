package pingwit.lec_12.classwork.part_2.point_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class PredicateCollectionExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(10);
        integers.add(10);
        integers.add(20);
        integers.add(30);

        System.out.println(integers);
        Predicate<Integer> filter = x -> x < 20;

//        integers.removeIf(x -> x < 20);
        integers.removeIf(filter);

        System.out.println(integers);

//        List<Integer> integersListOf = List.of(200, 150);
//        integersListOf.removeIf(filter);
//        System.out.println(integersListOf);
//
//        Map<String, Integer> people = Map.of(
//            "name", 33,
//            "Egorka", 33,
//            "Vasiliy", 33
//        );

    }
}
