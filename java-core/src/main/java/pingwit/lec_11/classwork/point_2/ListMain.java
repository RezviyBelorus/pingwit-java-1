package pingwit.lec_11.classwork.point_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();

        names.add("Egorka");
        names.add("Olya");
        names.add(0, "SnoopDog");

        names.addAll(names);
        ArrayList<String> filter = new ArrayList<>();
        filter.add("SnoopDog");
        names.removeAll(filter);

        System.out.println(names);

        ArrayList<String> filterEgorka = new ArrayList<>();
        filterEgorka.add("Egorka");

        names.retainAll(filterEgorka);
        System.out.println(names.get(0));


        System.out.println(names);

        for (String name : names) {
            System.out.println(name);
        }

    }
}
