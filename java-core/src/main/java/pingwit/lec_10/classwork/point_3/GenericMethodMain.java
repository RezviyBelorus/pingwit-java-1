package pingwit.lec_10.classwork.point_3;

public class GenericMethodMain {
    public static void main(String[] args) {
        String name = "Egorka";
        String olya = "Olya";
        Integer age = 666;

        Boolean result = GenericMethod.isEqual(name, age);

        System.out.println(result);
    }
}
