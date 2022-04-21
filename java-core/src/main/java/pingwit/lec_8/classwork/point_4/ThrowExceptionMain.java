package pingwit.lec_8.classwork.point_4;

import pingwit.lec_8.classwork.point_3.MyCustomException;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ThrowExceptionMain {
    public static void main(String[] args) throws MyCustomException {
        Integer input;

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please insert some number:");
            input = scanner.nextInt();

            System.out.println("Your choice=" + input);
        } catch (Exception e) {
            throw new MyCustomException("Your number is not correct", LocalDateTime.now());
        } finally {
            System.out.println("Block finally");
        }
    }

}
