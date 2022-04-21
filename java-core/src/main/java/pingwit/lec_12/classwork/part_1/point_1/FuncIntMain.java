package pingwit.lec_12.classwork.part_1.point_1;

public class FuncIntMain {
    public static void main(String[] args) {
        /*
        service = new CustomerService();
        service.map().filter().generateResult()
        * */

        FuncInterfaceExample funcInterfaceExample = () -> {
            System.out.println("==TRUE==");
            return true;
        };

        boolean test = funcInterfaceExample.test();

        System.out.println(test);
    }

}
