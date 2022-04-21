package pingwit.lec_4.classwork.point_6;

public class EqualsMain {
    public static void main(String[] args) {
        Wing wing_1 = new Wing("modelWing", "White");
        Airplane airplane_1 = new Airplane(wing_1, true);

        Wing wing_2 = new Wing("modelWing", "White");
        Airplane airplane_2 = new Airplane(wing_2, true);

        System.out.println("airplane_1=" + airplane_1);
        System.out.println("airplane_2=" + airplane_2);

        System.out.println("==equals==");
        System.out.println(airplane_1.equals(airplane_2));
//        System.out.println(airplane_1 == airplane_2);

        System.out.println("==hasCode==");
        System.out.println(airplane_1.hashCode());
        System.out.println(airplane_2.hashCode());
        // hashCode_1 == hashCode_2
        // equals_1 == equals_2
    }

}
