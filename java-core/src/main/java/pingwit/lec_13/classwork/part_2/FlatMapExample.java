package pingwit.lec_13.classwork.part_2;

import pingwit.lec_13.classwork.entity.Phone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
            new Phone("Xs", "Apple", 200),
            new Phone("8", "Apple", 400),
            new Phone("S10", "Samsung", 250),
            new Phone("S10", "Samsung", 350),
            new Phone("3310", "Nokia", 1000)
        );


        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(1, 2, 3));
        list.add(List.of(4, 5, 6));
        list.add(List.of(7, 8, 9));

        List<Integer> integerStream = list.stream()
            .flatMap(Collection::stream)
            .filter(x -> x > 3)
            .map(x -> ++x)
            .collect(Collectors.toList());

        System.out.println(list);
        System.out.println(integerStream);

    }

}
