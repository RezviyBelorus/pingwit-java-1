package pingwit.lec_10.classwork.point_2;

import java.io.Serializable;

public class GenericClass<T> {

    private T id;

    public GenericClass(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
            "id=" + id +
            '}';
    }

}
