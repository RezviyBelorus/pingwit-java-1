package pingwit.lec_11.classwork.point_4;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private Integer iq;
    private String profession;

    public Student(Integer iq, String profession) {
        this.iq = iq;
        this.profession = profession;
    }

    @Override
    public int compareTo(Student o) {
        int iq = this.iq.compareTo(o.iq);

        if (iq != 0) {
            return iq;
        }

        return profession.compareTo(o.profession);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(iq, student.iq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iq);
    }

    @Override
    public String toString() {
        return "Student{" +
            "iq=" + iq +
            ", profession='" + profession + '\'' +
            '}';
    }

}
