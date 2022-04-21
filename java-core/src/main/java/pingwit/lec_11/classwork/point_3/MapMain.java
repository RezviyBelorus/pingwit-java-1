package pingwit.lec_11.classwork.point_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        Map<String, Integer> persons = new HashMap<>();

        persons.put("Egorka", 333);
        persons.put("Olya", 90);
        persons.put("SnoopDog", 3);

        Integer egorka = persons.get("Egorka");
        System.out.println(egorka);

        persons.put("Egorka", 55);

        System.out.println(persons);

        Set<String> names = persons.keySet();
        for (String name : names) {
            Integer integer = persons.get(name);
        }

        Set<Map.Entry<String, Integer>> entries = persons.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {

        }

    }
}
