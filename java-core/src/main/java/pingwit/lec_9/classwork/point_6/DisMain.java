package pingwit.lec_9.classwork.point_6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DisMain {
    public static void main(String[] args) {
        try (FileInputStream fos = new FileInputStream("src/main/java/pingwit/lec_9/classwork/point_6/point_6_file");
             DataInputStream dos = new DataInputStream(fos)){

            boolean isTrue = dos.readBoolean();
            double myDouble = dos.readDouble();

            System.out.println(isTrue);
            System.out.println(myDouble);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
