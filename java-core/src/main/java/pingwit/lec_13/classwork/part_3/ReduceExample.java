package pingwit.lec_13.classwork.part_3;

import pingwit.lec_13.classwork.entity.Phone;

import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
//            new Phone("Xs", "Apple", 200),
//            new Phone("8", "Apple", 400),
//            new Phone("S10", "Samsung", 250),
//            new Phone("S10", "Samsung", 350),
//            new Phone("3310", "Nokia", 1000)
        );

        Optional<Integer> totalPhonesPrice = phones.stream()
            .map(Phone::price)
            .filter(price -> price > 300)
            .reduce(Integer::sum);

        Integer finalResult = totalPhonesPrice.orElse(666);

//        System.out.println(totalPhonesPrice.get());
//        totalPhonesPrice.ifPresent(System.out::println);
        System.out.println(totalPhonesPrice);

        Integer superReducer = phones.stream()
            .map(Phone::price)
//            .filter(price -> price > 300)
            .reduce(
                -500,
                (price1, price2) -> {
                    if (price2 > 300) {
                        return price1 + price2;
                    } else {
                        return price1;
                    }
                },
                Integer::sum
            );

        System.out.println(superReducer);
    }
}
