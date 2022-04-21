package pingwit.lec_4.classwork.point_6;

import java.util.Objects;

public class Wing {
    private String model;
    private String color;

    public Wing(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Wing wing = (Wing) o;
        return Objects.equals(model, wing.model) && Objects.equals(color, wing.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }

}
