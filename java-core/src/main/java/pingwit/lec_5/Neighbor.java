package pingwit.lec_5;

public class Neighbor {
    private String name;
    private Integer age;
    private static String text; // статик поля класса идут раньше обычных

    static {
        text = "Hello from static";
    }

    public Neighbor(String name,Integer age) {
        this.name = name;
        this.age = age;
    }

    public static String getText() { // конструктор без аргументов лучше сделать выше других конструкторов
        return text;
    }

    public static void setText(String text) {
        Neighbor.text = text;
    }

    public String toString() {
        return "Neighbor{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }

    protected String showNameInf() {
        return name + " hi is " + age + " years old ";
    }

    public Neighbor() {
// pltcm gecnfz
        this ("Oleg", 29);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
}
