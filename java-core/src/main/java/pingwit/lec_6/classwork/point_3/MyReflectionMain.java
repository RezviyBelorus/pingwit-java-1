package pingwit.lec_6.classwork.point_3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyReflectionMain {
    public static void main(String[] args) throws Exception {
//        MyReflection myReflection = new MyReflection();

        Constructor<?>[] declaredConstructors = MyReflection.class.getDeclaredConstructors();

        MyReflection myReflection = null;

        for (Constructor<?> declaredConstructor : declaredConstructors) {
            int parameterCount = declaredConstructor.getParameterCount();
            if (parameterCount == 1) {
                declaredConstructor.setAccessible(true);
                myReflection = (MyReflection) declaredConstructor.newInstance(33);
            }
        }

        System.out.println(myReflection);

        Field name = MyReflection.class.getDeclaredField("name");
        name.setAccessible(true);
        name.set(myReflection, "Egorka");

        System.out.println(myReflection);

        Method[] declaredMethods = MyReflection.class.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {
            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();

            if (parameterTypes.length == 1) {
                for (Class<?> parameterType : parameterTypes) {
                    if (String.class.getName().equals(parameterType.getName())) {
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(myReflection, "Egorka");
                    }
                }
            }
        }

        Field aConst = MyReflection.class.getDeclaredField("CONST");
        aConst.setAccessible(true);
        aConst.set(myReflection, "New Constant value");
    }

}
