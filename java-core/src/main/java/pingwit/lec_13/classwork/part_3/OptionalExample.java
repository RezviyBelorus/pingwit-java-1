package pingwit.lec_13.classwork.part_3;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Integer number = null;
        Integer secondNumber = 20;

        Integer result = sum(number, secondNumber);

        System.out.println(result);
    }

    private static Integer sum(Integer first, Integer second) {
        return Optional.ofNullable(first)
            .map(x -> x + second)
            .orElseThrow(() -> new RuntimeException("Gde noski?"));
    }

}
