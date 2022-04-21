package pingwit.lec_10.classwork.point_2;

import java.util.Arrays;

public class GenericWarehouse<T> {
    private T[] data;

    public GenericWarehouse(T[] data) {
        this.data = data;
    }

    public void add(T[] newData) {
        T[] result = Arrays.copyOf(data, data.length + newData.length);

        int newDataIndex = 0;

        for (int i = data.length; i < result.length; i++) {
            result[i] = newData[newDataIndex];
            newDataIndex++;
        }

        data = result;
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }

}
