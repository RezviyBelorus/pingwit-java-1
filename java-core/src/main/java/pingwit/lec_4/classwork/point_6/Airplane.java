package pingwit.lec_4.classwork.point_6;

import java.util.Objects;

public class Airplane {
    private Wing wing;
    private Boolean motor;

    public Airplane(Wing wing, Boolean motor) {
        this.wing = wing;
        this.motor = motor;
    }

    public Wing getWing() {
        return wing;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }

    public Boolean getMotor() {
        return motor;
    }

    public void setMotor(Boolean motor) {
        this.motor = motor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Airplane airplane = (Airplane) o;
        return Objects.equals(wing, airplane.wing) && Objects.equals(motor, airplane.motor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wing, motor);
    }

}
