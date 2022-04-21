package pingwit.lec_11.classwork.point_3;

import java.util.HashMap;
import java.util.Map;

public class MapGolubMain {
    public static void main(String[] args) {
        Map<Golub, Integer> golubs = new HashMap<>();

        Golub petrMain = new Golub(1, "Petr");

        Golub petr = new Golub(1, "Petr");
        Golub golubka = new Golub(2, "Golubka");

        golubs.put(petr, 2);
        golubs.put(golubka, 5);

        System.out.println(golubs);

        System.out.println(golubs.get(petrMain));
        petrMain.setAge(40);
        System.out.println(golubs.get(petrMain));

        System.out.println(golubs);


        for (Map.Entry<Golub, Integer> golubIntegerEntry : golubs.entrySet()) {
            Golub key = golubIntegerEntry.getKey();
            Integer value = golubIntegerEntry.getValue();
        }

        System.out.println(golubs.size());
    }
}
