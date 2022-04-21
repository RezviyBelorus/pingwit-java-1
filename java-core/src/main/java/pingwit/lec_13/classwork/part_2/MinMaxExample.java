package pingwit.lec_13.classwork.part_2;

import pingwit.lec_13.classwork.entity.Phone;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinMaxExample {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
            new Phone("Xs", "Apple", 200),
            new Phone("8", "Apple", 400),
            new Phone("S10", "Samsung", 250),
            new Phone("S10", "Samsung", 350),
            new Phone("3310", "Nokia", 1000)
        );

        Optional<Phone> minPricePhone = phones.stream()
            .min(Comparator.comparing(Phone::price));

        System.out.println(minPricePhone.get());

        Optional<Phone> maxPricePhone = phones.stream()
            .max(Comparator.comparing(Phone::price));

        System.out.println(maxPricePhone.get());


        IntSummaryStatistics statistics = phones.stream()
            .map(Phone::price)
            .collect(Collectors.summarizingInt(Integer::valueOf));

        System.out.println(statistics.getMax());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getSum());
        System.out.println(statistics.getAverage());

    }
}
