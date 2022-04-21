package pingwit.lec_10.classwork.point_2;

import java.util.Arrays;

public class GenericWarehouseMain {
    public static void main(String[] args) {
        GenericClass<String> stringId = new GenericClass<>("stringId");
        GenericClass<String> abcde = new GenericClass<>("ABCDE");

        GenericClass[] data = {stringId, abcde};

        GenericWarehouse<GenericClass> warehouse = new GenericWarehouse<>(data);

        warehouse.add(data);

        Integer[] integerData = {33, 44};

        System.out.println(Arrays.toString(warehouse.getData()));

        GenericWarehouse<Integer> warehouseInteger = new GenericWarehouse<>(integerData);

        NumberWarehouse<Integer> tNumberWarehouse = new NumberWarehouse<>(integerData);
        NumberWarehouse<Double> doubleWarehouse = new NumberWarehouse<>(new Double[]{1.0, 3.4});
//        NumberWarehouse<String> stringWarehouse = new NumberWarehouse<>(new String[]{"EG"});
    }
}
