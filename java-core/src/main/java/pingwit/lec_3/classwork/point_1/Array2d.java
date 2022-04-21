package pingwit.lec_3.classwork.point_1;

import java.util.Arrays;

public class Array2d {
    public static void main(String[] args) {
        int[][] array2d = new int[5][4];

        for (int i = 0; i < array2d.length; i++) { // O(n2)
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = j;
            }
        }

        for (int i = 0; i < array2d.length; i++) {
            System.out.println(Arrays.toString(array2d[i]));
        }

        System.out.println("String array:");

        String[][] names = {
            {"Egorka", "Olga", "Semen"},
            {"Molodec", "Uletela", "Nado prodac"}
        };

//        V1 print array
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(Arrays.toString(names[i]));
//        }

//        V2 print array
        System.out.println(Arrays.deepToString(names));

        int[][][] array3d = new int[5][5][0];
    }

}
