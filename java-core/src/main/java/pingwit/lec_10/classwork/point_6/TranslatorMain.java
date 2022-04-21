package pingwit.lec_10.classwork.point_6;

public class TranslatorMain {
    public static void main(String[] args) {
        System.out.println(Translator.YANDEX == Translator.YANDEX);
        System.out.println(Translator.YANDEX.equals(Translator.YANDEX));

        System.out.println(Translator.YANDEX.getDomain());
        System.out.println(Translator.GOOGLE.getDomain());

        String url = Translator.GOOGLE.translateUrl("spring");

        System.out.println(url);
    }
}
