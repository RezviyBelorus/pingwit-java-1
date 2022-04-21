package pingwit.lec_4.classwork.point_1;

public class StudentMain {
    public static void main(String[] args) {
        Student alex = new Student("Alex", 18);
        Student randomStudent = new Student();

        System.out.println(alex.name);
        System.out.println(alex.age);
        System.out.println(alex.male);

        System.out.println(randomStudent.name);
        System.out.println(randomStudent.age);
        System.out.println(randomStudent.male);

    }
}
