package pingwit.lec_2.classwork.point_5;

public class BreakMain {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Break inside of I");
                break;
            }
            System.out.println("i=" + i);

//            int i = 1;
            for (int j = 0; j < 5; j++) {
                if (j < 5) {
                    System.out.println("Break inside of J");
                    break;
                }
                System.out.println("Hello from J cycle");
            }

            System.out.println("After the J cycle");

        }

        int i = 1;

        System.out.println("After the I cycle");
    }
}
