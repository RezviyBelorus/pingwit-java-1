package pingwit.lec_5.classwork.point_1;

import java.util.Objects;

public interface Car {
    String FUEL = "benzin";

    void enable();

    void openDoor();

    void setColor(String color);

    default boolean hasWheel() {
        return true;
    }
}

class Tesla implements Car {
    private static boolean HAS_AUTOPILOT = false;

    private String color;

    @Override
    public void enable() {
        System.out.println("Tsssss");
    }

    @Override
    public void openDoor() {
        System.out.println("Tesla's door opened");
    }

//    @Override
    public void enableLight() {
        System.out.println("Tesla's light enabled");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean hasAutopilot() {
        return HAS_AUTOPILOT;
    }

    public void setAutopilot(boolean autopilot) {
        HAS_AUTOPILOT = autopilot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tesla tesla = (Tesla) o;
        return Objects.equals(color, tesla.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

}
