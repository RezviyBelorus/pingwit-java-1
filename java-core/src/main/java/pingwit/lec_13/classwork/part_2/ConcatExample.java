package pingwit.lec_13.classwork.part_2;

import pingwit.lec_13.classwork.entity.Phone;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatExample {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
            new Phone("Xs", "Apple", 200),
            new Phone("8", "Apple", 400),
            new Phone("S10", "Samsung", 250),
            new Phone("S10", "Samsung", 350),
            new Phone("3310", "Nokia", 1000)
        );

        List<Phone> phonesNew = List.of(
            new Phone("Xs", "Apple", 200),
            new Phone("8", "Apple", 400),
            new Phone("S10", "Samsung", 250),
            new Phone("S10", "Samsung", 350),
            new Phone("3310", "Nokia", 1000)
        );

        Stream<Phone> stream = phones.stream();
        Stream<Phone> streamNew = phonesNew.stream();

        List<Phone> mergedPhones = Stream.concat(stream, streamNew).collect(Collectors.toList());

    }
}
