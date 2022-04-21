package pingwit.lec_9.classwork.point_10;

import java.io.File;
import java.util.Arrays;

public class FileMain {
    public static void main(String[] args) {
        File file = new File("src/main/java/pingwit/lec_9/practice/task.txt");

        System.out.println(file.exists());
        System.out.println("file.isFile()=" + file.isFile());
        System.out.println("file.isDirectory()=" + file.isDirectory());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.getParent());

        File classwork = new File("src/main/java/pingwit/lec_9/classwork");
        System.out.println(Arrays.toString(classwork.listFiles()));
    }
}
