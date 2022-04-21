package pingwit.lec_9.classwork.point_8;

import java.io.BufferedReader;
import java.io.FileReader;

public class BuffReaderMain {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/main/java/pingwit/lec_9/practice/task.txt");
             BufferedReader br = new BufferedReader(fr)
        ) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {

        }
    }
}
