package pingwit.lec_9.classwork.point_7;

import java.io.FileWriter;

public class FwMain {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("src/main/java/pingwit/lec_9/classwork/point_7/file.txt")) {

            String message = "Hello from method main";

            fw.write(message);
            fw.flush();
        } catch (Exception e) {

        }
    }

}
