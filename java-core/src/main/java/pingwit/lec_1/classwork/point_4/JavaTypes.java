package pingwit.lec_1.classwork.point_4;

public class JavaTypes {
    public static void main(String[] args) {
        // byte, short, char, int
        /*
        byte 2^8 -> 2^7-1 -> -128 +127
        short 2^16
        char 2^16-1 -> max 0-65535
        int 2^32
        long 2^64
        */

        // 0 12 33
        // 0.1214
        // true/false

        // byte, short, char, int, long
        // float, double
        // boolean

        //String -> "Egorka"

        byte age = 127;

        String name = "Egorka";

        char myChar = '0';
        char mySymbolChar = 'K';
        char myUTFChar = '\u33f0';

        System.out.println(myChar);
        System.out.println(mySymbolChar);
        System.out.println(myUTFChar);

        float myFloat = 33.0f;

        double myDouble = 33;

        boolean myBoolean = true;
    }
}
