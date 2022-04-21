package pingwit.lec_11.classwork.point_3;

import java.util.Objects;

public class Golub {
    private Integer age;
    private String gender;

    public Golub(Integer age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Golub{" +
            "age=" + age +
            ", gender='" + gender + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Golub golub = (Golub) o;
        return Objects.equals(age, golub.age) && Objects.equals(gender, golub.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, gender);
    }

}
