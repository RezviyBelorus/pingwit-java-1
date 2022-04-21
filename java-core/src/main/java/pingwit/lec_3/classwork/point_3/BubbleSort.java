package pingwit.lec_3.classwork.point_3;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] arrayToSort = {2, 3, 4, 1}; // length = 4
        int[] arrayToSort = {88, 4, 88, 3, 2, 1}; // length = 4
        //0, 1, 2, 3

        boolean needToSort = true;

        while (needToSort) {
            needToSort = false;

            for (int i = 1; i < arrayToSort.length; i++) {
                if (arrayToSort[i - 1] > arrayToSort[i]) {
                    //swap
                    int tmp = arrayToSort[i - 1];
                    arrayToSort[i - 1] = arrayToSort[i];
                    arrayToSort[i] = tmp;

                    needToSort = true;
                }
            }

            System.out.println(Arrays.toString(arrayToSort));
        }

        System.out.println("Final result");
        System.out.println(Arrays.toString(arrayToSort));
    }

}
