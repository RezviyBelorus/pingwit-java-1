package pingwit.lec_9.classwork.point_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesNioMain {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/main/java/pingwit/lec_9/practice/task.txt");

        String string = Files.readString(path);

        System.out.println(string);
    }
}
