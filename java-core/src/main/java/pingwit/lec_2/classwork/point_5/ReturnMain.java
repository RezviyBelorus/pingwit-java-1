package pingwit.lec_2.classwork.point_5;

public class ReturnMain {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                break;
            }
            System.out.println("Break cycle i=" + i);
        }

        System.out.println("After the break");

        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                return;
            }
            System.out.println("Return cycle i=" + i);
        }

        System.out.println("After the return");
    }

}
