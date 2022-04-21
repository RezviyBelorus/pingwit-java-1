package pingwit.lec_5.classwork.point_4;

public class FinalField {
    private final String name;
    private Integer age;

    public FinalField(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        FinalField egorka = new FinalField("Egorka");

        System.out.println(egorka.getName());
        System.out.println(egorka.getName());
    }

}
