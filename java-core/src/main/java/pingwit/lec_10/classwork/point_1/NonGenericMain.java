package pingwit.lec_10.classwork.point_1;

import java.util.Arrays;

public class NonGenericMain {
    public static void main(String[] args) {
        NonGenericClass stringId = new NonGenericClass("StringId");
        NonGenericClass integerId = new NonGenericClass(666);

        Integer id = (Integer) integerId.getId();

        id++;
        integerId.setId(id);

        System.out.println(integerId.getId());

        NonGenericClass[] data = {stringId, integerId};

        for (NonGenericClass elem : data) {
            String idToChange = (String) elem.getId();
            idToChange = idToChange + "I";
            elem.setId(idToChange);
        }

        System.out.println(Arrays.toString(data));
    }

}
