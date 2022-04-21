package pingwit.lec_11.classwork.point_4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        Set<Integer> integers = new TreeSet<>();

        integers.add(3);
        integers.add(2);
        integers.add(0);

        System.out.println(integers);


        Set<Student> students = new TreeSet<>();

        students.add(new Student(33, "Programmer"));
        students.add(new Student(30, "Stylist"));
        students.add(new Student(30, "AEkonomist"));

        System.out.println(students);
    }
}
