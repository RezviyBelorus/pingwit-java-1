package pingwit.lec_7.classwork.point_3_4;

public class StringBuilderBufferMain {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Начало...");

        System.out.println(text);

        text.append("...продолжение").append("bla bla bla");
        text.reverse();

        System.out.println(text);
    }
}
