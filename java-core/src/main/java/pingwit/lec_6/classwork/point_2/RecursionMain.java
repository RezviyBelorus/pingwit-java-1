package pingwit.lec_6.classwork.point_2;

public class RecursionMain {
    public static void main(String[] args) {
        int x = 0;

        for (int i = 0; i < 10; i++) {
            x++;
        }

        System.out.println(x);

        x = 0;

        x = calculate(x);

        System.out.println(x);
    }

    private static int calculate(int x) {
        if (x < 10) {
            System.out.println(x);
            return calculate(++x);
        }

        return x;
    }

}
