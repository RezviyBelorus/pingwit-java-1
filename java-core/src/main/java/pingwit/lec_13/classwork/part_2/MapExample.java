package pingwit.lec_13.classwork.part_2;

import pingwit.lec_13.classwork.entity.Phone;
import pingwit.lec_13.classwork.entity.PhoneShorten;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
            new Phone("Xs", "Apple", 200),
            new Phone("8", "Apple", 400),
            new Phone("S10", "Samsung", 250),
            new Phone("S10", "Samsung", 350),
            new Phone("3310", "Nokia", 1000)
        );

        Set<String> producers = phones.stream()
            .map(Phone::producer)
            .collect(Collectors.toSet());

        System.out.println(producers);

        List<PhoneShorten> collect = phones.stream()
            .filter(phone -> phone.price() > 400)
            .map(phone -> new PhoneShorten(phone.model(), phone.producer()))
            .collect(Collectors.toList());

        System.out.println(collect);
    }
}
