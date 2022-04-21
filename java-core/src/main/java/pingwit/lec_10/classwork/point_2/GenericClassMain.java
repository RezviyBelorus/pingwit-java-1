package pingwit.lec_10.classwork.point_2;

import pingwit.lec_10.classwork.point_1.NonGenericClass;

public class GenericClassMain {
    public static void main(String[] args) {
        GenericClass<String> stringId = new GenericClass<>("StringId");
        GenericClass<Integer> integerId = new GenericClass<>(666);

        String stringIdValue = stringId.getId();
        Integer integerIdValue = integerId.getId();


//        GenericClass<String>[] data = {stringId};

    }
}
