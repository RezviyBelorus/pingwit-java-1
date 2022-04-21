package pingwit.lec_6.classwork.point_5;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyRecordMain {
    public static void main(String[] args) throws Exception {
        MyRecord myRecord = new MyRecord("Egorka");
        MyRecord antoshka = new MyRecord("Egorka");

        System.out.println(myRecord.name());

        Method sayHi = MyRecord.class.getDeclaredMethod("sayHi");
        sayHi.setAccessible(true);
        sayHi.invoke(myRecord);

        System.out.println(myRecord);
        System.out.println("myRecord.equals(antoshka)=" + myRecord.equals(antoshka));
    }
}
