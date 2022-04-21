package pingwit.lec_9.classwork.point_4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class BaisBaosMain {
    public static void main(String[] args) {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()){
            String message = "Nice day";
            byte[] messageBytes = message.getBytes();

            bos.write(messageBytes);

            byte[] bosByteArray = bos.toByteArray();
            System.out.println(Arrays.toString(bosByteArray));

            for (int i = 0; i < bosByteArray.length; i++) {
                System.out.print((char)bosByteArray[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
