package pingwit.lec_7.classwork.point_2;

import java.util.Objects;

public class StringMain {
    public static void main(String[] args) {
        String egorka_1 = "Egorka";
        String egorka_2 = "Egorka";

        String egorka_3 = new String("Egorka");

        System.out.println(egorka_2.equals(egorka_1));
        System.out.println(Objects.equals(egorka_1, egorka_2));
        System.out.println(egorka_1 == egorka_2);
        System.out.println(egorka_1.equals(egorka_3));
        System.out.println(egorka_1 == egorka_3.intern());

//        egorka_1 = egorka_1 + "The end";
        System.out.println(egorka_1);
//        egorka_1 = egorka_1.concat(" The end");
        egorka_1 = egorka_1 + " The end";
        System.out.println(egorka_1);
    }
}
