package pingwit.lec_5.classwork.point_1;

public class CarMain {
    public static void main(String[] args) {
        Tesla blueTesla = new Tesla();
        blueTesla.setColor("blue");
        blueTesla.enableLight();
        blueTesla.hasWheel();
        System.out.println("blueTesla=" + blueTesla.hasAutopilot());
        blueTesla.setAutopilot(true);
        System.out.println("blueTesla=" + blueTesla.hasAutopilot());

        Tesla redTesla = new Tesla();
        redTesla.setColor("blue");
        redTesla.hasWheel();
        System.out.println("redTesla=" + redTesla.hasAutopilot());
//        redTesla.enableLight();

    }
}
