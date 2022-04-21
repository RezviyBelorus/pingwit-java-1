package pingwit.lec_13.classwork.part_2;

import pingwit.lec_13.classwork.entity.Phone;

import java.util.List;

public class AllMatchAnyMatch {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
            new Phone("Xs", "Apple", 200),
            new Phone("8", "Apple", 400),
            new Phone("S10", "Samsung", 250),
            new Phone("S10", "Samsung", 350),
            new Phone("3310", "Nokia", 1000)
        );

        boolean allMatchResult = phones.stream()
            .allMatch(phone -> phone.price() > 300);

        boolean anyMatchResult = phones.stream()
            .anyMatch(phone -> phone.price() > 300);

        System.out.println(allMatchResult);
        System.out.println(anyMatchResult);
    }
}
