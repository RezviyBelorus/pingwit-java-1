package pingwit.lec_9.classwork.point_3;

import java.io.FileInputStream;
import java.io.IOException;

public class FisWithResourcesMain {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/main/java/pingwit/lec_9/practice/task.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
