package pingwit.lec_13.classwork.part_1;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamIterateExample {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

        }

        Optional<Integer> reduce = Stream.iterate(10, n -> ++n)
            .limit(4)
            .filter(x -> x % 2 == 0)
            .reduce(Integer::sum);

        System.out.println(reduce.get());
    }
}
