package pingwit.lec_4.classwork.point_4_5;

public class Car {
    // private, package (default), protected, public
    private String producer;
    private String number;

    public Car(String producer, String number) {
        this.producer = producer;
        this.number = number;
    }

    public String toString() {
        return "Car{" +
            "producer='" + producer + '\'' +
            ", number='" + number + '\'' +
            '}';
    }

    protected String fullCarName() {
        return producer + "&" + number;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
