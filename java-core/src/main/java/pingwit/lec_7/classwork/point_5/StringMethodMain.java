package pingwit.lec_7.classwork.point_5;

import java.util.Arrays;

public class StringMethodMain {
    public static void main(String[] args) {
        String text = "11While major 11gameplay components11   ";

        System.out.println(text.charAt(text.length()-1));

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.replaceAll("11", ""));
        System.out.println("!" + text + "!");
        System.out.println("!" + text.stripLeading() + "!");
        System.out.println("!" + text.stripTrailing() + "!");
        System.out.println(text.repeat(3));
        System.out.println(text.strip());
        System.out.println(text.toLowerCase().contains("w"));
        System.out.println(text.substring(2));
        System.out.println(text.substring(2, 3));
        System.out.println(text.charAt(2));
        System.out.println(text.indexOf("W"));
        System.out.println(text.startsWith("11While"));
        System.out.println("While=" + text.startsWith("While"));
        System.out.println("While with offset=" + text.startsWith("While", 2));

        String integersString = "1,3,4,5,6";
        String[] split = integersString.split(",");
        Integer[] integers = new Integer[split.length];

        for (int i = 0; i < split.length; i++) {
            integers[i] = Integer.valueOf(split[i]);
        }

        System.out.println(split[0] + split[1]);
        System.out.println(integers[0] + integers[1]);
        System.out.println(Arrays.toString(integers));
    }
}
