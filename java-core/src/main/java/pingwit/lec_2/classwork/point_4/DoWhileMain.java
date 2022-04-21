package pingwit.lec_2.classwork.point_4;

public class DoWhileMain {
    public static void main(String[] args) {
        int i = 0;

        while (i <= 4 || i < 10) {
            ++i;
            System.out.println("i=" + i);
        }
        System.out.println("After the while");
        System.out.println("i=" + i);

        do {
            System.out.println("Hello from do-while");
        } while (i <= 4);


        while (i <= 4 && i < 10) {
            ++i;
            System.out.println("i=" + i);
        }
    }

}
