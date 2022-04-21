package pingwit.lec_4.classwork.point_1;

public class Student {
    Integer id; //int
    Integer age;
    String name;
    Boolean male; //boolean

    public Student() {
        this(12, 333, "Unknown", true);
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student(Integer id, Integer age, String name, Boolean male) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.male = male;
    }

}
