package pingwit.lec_5.classwork.point_4;

public class ChildClass extends FinalMethod {
//    Overloading
    protected String name(String name) {
        return "Andrei";
    }

    public static void main(String[] args) {
        FinalMethod finalMethod = new FinalMethod();
        FinalMethod childClass = new ChildClass();

        System.out.println(finalMethod.name());
        System.out.println(childClass.name());
    }
}
