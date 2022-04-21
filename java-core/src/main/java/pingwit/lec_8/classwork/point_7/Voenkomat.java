package pingwit.lec_8.classwork.point_7;

import java.lang.reflect.Field;

public class Voenkomat {

    public Boolean isPrigoden(Object object) throws IllegalAccessException, NePrigodenException {
        Field[] declaredFields = object.getClass().getDeclaredFields();

        for (Field declaredField : declaredFields) {
            if (declaredField.getAnnotation(Age.class) != null) {
                Age annotation = declaredField.getAnnotation(Age.class);
                int min = annotation.min();
                int max = annotation.max();

                declaredField.setAccessible(true);
                Integer value = (Integer) declaredField.get(object);

                if (value < min) {
                    throw new NePrigodenException("Uniec, ti slishkom mal!");
                }

                if (value > max) {
                    throw new NePrigodenException("4to pojelaesh hozain?");
                }
            }
        }

        return true;
    }
}
