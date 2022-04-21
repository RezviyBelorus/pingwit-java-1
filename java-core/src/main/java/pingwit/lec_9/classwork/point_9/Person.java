package pingwit.lec_9.classwork.point_9;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 4290637187045274022L;

    private String name;
    private transient String surname;
    private Integer age;
    private Work work;

    public Person() {
    }

    public Person(String name, String surname, Integer age, Work work) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.work = work;
    }

    public String getName() {
        return name;
    }

}
