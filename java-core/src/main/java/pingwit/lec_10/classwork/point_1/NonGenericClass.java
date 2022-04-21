package pingwit.lec_10.classwork.point_1;

public class NonGenericClass {
    private Object id;

    public NonGenericClass(Object id) {
        this.id = id;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "NonGenericClass{" +
            "id=" + id +
            '}';
    }

}
