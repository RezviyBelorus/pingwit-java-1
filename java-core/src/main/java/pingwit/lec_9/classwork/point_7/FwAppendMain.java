package pingwit.lec_9.classwork.point_7;

import java.io.FileWriter;

public class FwAppendMain {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("src/main/java/pingwit/lec_9/classwork/point_7/file.txt", true)) {

            String message = " and privet mame";
//            fw.write(message);

            String startMessage = "Eto vstatvim v nachalo ";
            fw.write(startMessage, 5, startMessage.length());

            fw.flush();
        } catch (Exception e) {

        }
    }
}
