package pingwit.lec_3.classwork.point_4;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.next();

        System.out.println("Enter your age:");
        long age = scanner.nextLong();

        System.out.println("name=" + name);
        System.out.println("age=" + age);

//        int[] array = new int[5];
    }
}
