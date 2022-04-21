package pingwit.lec_12.classwork.part_1.point_1;

//@FunctionalInterface
public interface FuncInterfaceExample {
    boolean test();


    default void sayHi() {
       System.out.println("Hello from FuncInterfaceExample");
   }
}
