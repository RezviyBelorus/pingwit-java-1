package pingwit.lec_10.classwork.point_6;

public class StringFormatMain {
    public static void main(String[] args) {
        // %s %d
        String result = String.format("Hello world, %s, %d", "Egorka", 55);

        System.out.println(result);
        System.out.println("Hello world, " + "Egorka");
    }
}
