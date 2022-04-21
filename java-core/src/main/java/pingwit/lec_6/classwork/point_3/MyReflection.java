package pingwit.lec_6.classwork.point_3;

public class MyReflection {
    private static final String CONST = "myConst";

    private final String name = "defaultName";

    private Integer age;

    private MyReflection() {
    }

    private MyReflection(Integer age) {
        this.age = age;
    }

    private void sayHi(String name) {
        System.out.println("Hello from private method, " + name);
    }

    private void sayAge(Integer age) {
        System.out.println("My age is " + age);
    }

    @Override
    public String toString() {
        return "MyReflection{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }

}
