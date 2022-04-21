package pingwit.lec_13.classwork.part_3;

import pingwit.lec_13.classwork.entity.Phone;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMapExample {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
            new Phone("Xs", "Apple", 200),
//            new Phone("8", "Apple", 400),
            new Phone("S10", "Samsung", 250),
//            new Phone("S10", "Samsung", 350),
            new Phone("3310", "Nokia", 1000)
        );

        Map<String, Phone> byProducer = phones.stream()
            .collect(Collectors.toMap(Phone::producer, Function.identity()));

        byProducer.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
            System.out.println();
        });
    }
}
