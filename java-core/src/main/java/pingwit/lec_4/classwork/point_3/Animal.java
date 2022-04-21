package pingwit.lec_4.classwork.point_3;

public class Animal {

    private String name;

    {
        System.out.println("Hello from nonstatic block #1");
    }

    {
        System.out.println("Hello from nonstatic block #2");
    }

    static {
        System.out.println("Hello from static block #1");
    }

    static {
        System.out.println("Hello from static block #2");
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("Hello from constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
