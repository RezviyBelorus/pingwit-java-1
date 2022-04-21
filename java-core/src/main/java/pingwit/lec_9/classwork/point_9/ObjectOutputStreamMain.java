package pingwit.lec_9.classwork.point_9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamMain {
    public static void main(String[] args) {

        try (FileOutputStream fos =new FileOutputStream("src/main/java/pingwit/lec_9/classwork/point_9/object");
            ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            Person egorka = new Person("Egorka","Pupkin", 18, new Work("Javist"));
            oos.writeObject(egorka);

            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
