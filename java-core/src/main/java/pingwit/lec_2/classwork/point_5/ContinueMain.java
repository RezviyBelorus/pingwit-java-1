package pingwit.lec_2.classwork.point_5;

public class ContinueMain {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                System.out.println("Четное число, i=" + i);
                continue;
            } else {
                System.out.println("Нечетное число, i=" + i);
            }

//            System.out.println("Нечетное число, i=" + i);
        }
    }

}
