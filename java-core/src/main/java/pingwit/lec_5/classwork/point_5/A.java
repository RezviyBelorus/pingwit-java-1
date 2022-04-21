package pingwit.lec_5.classwork.point_5;

public class A extends B {

    static {
        System.out.println("Static init block A");
    }

    {
        System.out.println("Init block A");
    }

    public A() {
        super();
        System.out.println("Constructor A");
    }

}

class B extends C {

    static {
        System.out.println("Static init block B");
    }

    {
        System.out.println("Init block B");
    }

    public B() {
        super();
        System.out.println("Constructor B");
    }

}

class C {

    static {
        System.out.println("Static init block C");
    }

    {
        System.out.println("Init block C");
    }

    public C() {
        System.out.println("Constructor C");
    }

}
