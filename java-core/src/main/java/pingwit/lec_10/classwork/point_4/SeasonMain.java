package pingwit.lec_10.classwork.point_4;

public class SeasonMain {
    public static void main(String[] args) {
        Summer summer = new Summer();

        GenericConstructor genericConstructor = new GenericConstructor(summer);

        System.out.println(genericConstructor);
    }
}
