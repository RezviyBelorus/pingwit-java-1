package pingwit.lec_6.classwork.point_1;

import java.util.Objects;
import java.util.UUID;

public class ArrangementExample {
    private static final String SERIAL_NUMBER = UUID.randomUUID().toString();

    private final String name;
    private Integer age;

    public ArrangementExample() {
        this("default name");
    }

    public ArrangementExample(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ArrangementExample that = (ArrangementExample) o;
        return Objects.equals(name, that.name) && Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "ArrangementExample{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }

}
