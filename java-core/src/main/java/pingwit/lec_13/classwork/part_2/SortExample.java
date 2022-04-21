package pingwit.lec_13.classwork.part_2;

import pingwit.lec_13.classwork.entity.Phone;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortExample {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
            new Phone("Xs", "Apple", 200),
            new Phone("8", "Apple", 400),
            new Phone("S10", "Samsung", 250),
            new Phone("S10", "Samsung", 350),
            new Phone("3310", "Nokia", 1000)
        );

        List<Phone> sorted = phones.stream()
            .sorted(Comparator.comparing(Phone::price).thenComparing(Phone::model))
            .collect(Collectors.toList());

        System.out.println(phones);
        System.out.println(sorted);
    }
}
