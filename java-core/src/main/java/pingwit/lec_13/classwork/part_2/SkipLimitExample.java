package pingwit.lec_13.classwork.part_2;

import pingwit.lec_13.classwork.entity.Phone;

import java.util.List;
import java.util.stream.Collectors;

public class SkipLimitExample {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
            new Phone("Xs", "Apple", 200),
            new Phone("8", "Apple", 400),
            new Phone("S10", "Samsung", 250),
            new Phone("S10", "Samsung", 350),
            new Phone("3310", "Nokia", 1000)
        );

        List<Phone> limitedPhones = phones.stream()
            .skip(2)
            .limit(2)
            .collect(Collectors.toList());

        System.out.println(limitedPhones);
        System.out.println(limitedPhones.size());
    }
}
