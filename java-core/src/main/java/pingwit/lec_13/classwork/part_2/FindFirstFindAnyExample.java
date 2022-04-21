package pingwit.lec_13.classwork.part_2;

import pingwit.lec_13.classwork.entity.Phone;

import java.util.List;
import java.util.Optional;

public class FindFirstFindAnyExample {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
            new Phone("Xs", "Apple", 200),
            new Phone("8", "Apple", 400),
            new Phone("S10", "Samsung", 250),
            new Phone("S10", "Samsung", 350),
            new Phone("3310", "Nokia", 1000)
        );

        Optional<Phone> first = phones.stream()
            .findFirst();

        System.out.println(first.get());

        Optional<Phone> findAny = phones.stream()
            .findAny();
        System.out.println(findAny.get());


    }
}
