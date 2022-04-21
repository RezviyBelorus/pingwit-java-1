package pingwit.lec_15.classwork.point_2;

import java.util.ArrayList;
import java.util.List;

public class ReferenceExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        add(strings);

        System.out.println(strings.size());
        System.out.println(strings);

        hochuNaBali(strings);
        System.out.println(strings);

    }

    private static void add(List<String> strings) {
        strings.add("Hello");
    }

    private static void hochuNaBali(List<String> tickets) {
        tickets = List.of("A", "B");
    }
}
