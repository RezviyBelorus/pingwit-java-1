package pingwit.lec_3.classwork.point_1;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = new int[5];
        String[] names = {"Egorka", "Olga", "Semen"}; // String[] names = new String[3];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 2;
        }

//        for (int i = 0; i < array.length; i++) {
//            System.out.println("array[" + i + "]=" + array[i]);
//        }

        System.out.println(array);
        System.out.println(Arrays.toString(array));
        System.out.println("After the cycle");
    }

}
