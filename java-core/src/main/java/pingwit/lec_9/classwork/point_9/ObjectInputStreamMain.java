package pingwit.lec_9.classwork.point_9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamMain {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/main/java/pingwit/lec_9/classwork/point_9/object");
             ObjectInputStream ois = new ObjectInputStream(fis)
        ){
            Person egorka = (Person) ois.readObject();

            System.out.println();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
