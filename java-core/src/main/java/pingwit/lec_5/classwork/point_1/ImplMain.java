package pingwit.lec_5.classwork.point_1;

public class ImplMain {
    public static void main(String[] args) {
        A a = new Impl();
        B b = new Impl();
        B betta = new BettaImpl();
        Impl impl = new Impl();

        a.sayHi();
        b.sayHi();
        betta.sayHi();
        impl.sayHi();
    }

}
