package pingwit.lec_1.classwork.point_6;

public class JavaOperators {
    public static void main(String[] args) {
        int myInt_1 = 127;
        int myInt_2 = 127;

        int sum = myInt_1 + myInt_2;

        int sumAges = 33 + (2 * 1 + 20);

        System.out.println(myInt_1 + " " + myInt_2);
        System.out.println(sum);


        System.out.println("3/5=" + 3 / 5);
        System.out.println("3/5.0=" + 3 / 5.0);
        System.out.println("3>5=" + (3 > 5));
        System.out.println("3==5->" + (3 == 5));
        System.out.println("3!=5->" + (3 != 5));

        int x = 0;
        System.out.println("x=" + x);
        x = x + 1;
        System.out.println("x=" + x);

        x += 1; // x = x + 1;

        System.out.println("x=" + x);

        x++; // ++x
        ++x; // ++x

        System.out.println("x=" + x);
        System.out.println("x=" + ++x);
        System.out.println("x=" + x);
        System.out.println("x" + "b");

        System.out.println(3.51 + 4.49);

        System.out.println("8<<3=" + (8 << 3));
        System.out.println("8>>4=" + (8 >> 3));

        System.out.println("7 % 5=" + 7 % 5);
        System.out.println("7 % 5=" + 7 % 5);
    }

}
