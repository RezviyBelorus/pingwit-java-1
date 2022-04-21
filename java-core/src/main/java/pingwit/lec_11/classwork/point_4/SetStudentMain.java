package pingwit.lec_11.classwork.point_4;

import java.util.HashSet;
import java.util.Set;

public class SetStudentMain {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        students.add(new Student(33, ""));
        students.add(new Student(33,""));
        students.add(new Student(33,""));

        System.out.println(students);
    }
}
