package pingwit.lec_3.classwork.point_1;

public class ArrayForEachExample {
    public static void main(String[] args) {
        String[] names = {"Egorka", "Olga", "Semen"};
        int[] numbers = {1, 2, 4};

        for (int i = 0; i < names.length; i = i + 2) {
            System.out.println(names[i]);
        }

        for (int elem : numbers) {
            System.out.println(elem);
        }
    }

}
