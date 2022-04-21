package pingwit.lec_5.classwork.point_2_3;

import java.util.UUID;

public class AbstractMain {
    public static void main(String[] args) {
        Model3 blueModel3 = new Model3(UUID.randomUUID().toString());

        AbstractTesla redModel3 = new Model3(UUID.randomUUID().toString());

        System.out.println(blueModel3.licenceNumber);
        System.out.println(blueModel3.login("admin", "admin"));

//        AbstractTesla goldTesla = new AbstractTesla();
    }
}
