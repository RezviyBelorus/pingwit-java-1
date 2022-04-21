package pingwit.lec_2.classwork.point_2;

public class SwitchMain {
    public static void main(String[] args) {
        int x = 70;

        switch (x) {
            case 30:
                System.out.println("30");
                break;
            case 20:
                System.out.println("20");
                break;
            case 10:
                System.out.println("10");
                break;
            case 40:
                System.out.println("40");
                break;
            default:
                System.out.println("Default from old switch");
        }

        switch (x) {
            case 70 -> {
                System.out.println("70");
                System.out.println("Hello, Egorka");
            }
            case 80 -> System.out.println("80");
            default -> System.out.println("Default");
        }
    }
}
