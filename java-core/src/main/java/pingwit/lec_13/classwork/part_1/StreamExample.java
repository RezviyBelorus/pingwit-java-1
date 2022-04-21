package pingwit.lec_13.classwork.part_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        integers.add(11);
        integers.add(22);
        integers.add(33);

        Long sum = 0L;

        for (Integer integer : integers) {
            sum += integer;
        }

        System.out.println(sum);

        Stream<Integer> integerStream = integers.stream()
            .filter(x -> x > 20);

        System.out.println(integerStream.count());
        System.out.println(integerStream.reduce(Integer::sum));

//        Optional<Integer> result = integers.stream().reduce(Integer::sum);
//        System.out.println(result.get());
    }

    private static void collect(Stream<Integer> integerStream) {

    }
}
