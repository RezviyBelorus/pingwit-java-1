package pingwit.lec_8.classwork.point_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinallyMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please insert some number:");

            int input = scanner.nextInt();

            System.out.println("Your choice=" + input);
            int myInt = Integer.parseInt("AS");
        } catch (InputMismatchException e) {
            System.out.println("Your number is not correct");
            e.printStackTrace();
        } catch (Exception e) {

        } finally {
            System.out.println("Block finally");
        }

/*
        try {

        } catch (Exception e) {

        }
*/

/*        try {

        } finally {

        }
        */
    }

}
