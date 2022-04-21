package pingwit.lec_5.classwork.point_1;

interface A {
    default void sayHi() {
        System.out.println("Hi from A");
    }

}

interface B {
    default void sayHi() {
        System.out.println("Hi from B");
    }

}

public class Impl implements A, B {
    @Override
    public void sayHi() {
        System.out.println("Hi from class");
    }

}

class BettaImpl implements B {
    @Override
    public void sayHi() {
        System.out.println("Hi from BettaImpl");
    }

}
