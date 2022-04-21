package pingwit.lec_5.classwork.point_2_3;

import pingwit.lec_5.classwork.point_1.Car;

public class Model3 extends AbstractTesla implements Car, IlonMaskOwnership {

    public Model3(String licenceNumber) {
        super(licenceNumber);
    }

    @Override
    String login(String login, String password) {
        String abstractLogin = super.login(login, password);

        return "Model 3 " + abstractLogin;
    }

    @Override
    public void enable() {

    }

    @Override
    public void openDoor() {

    }

    @Override
    public void setColor(String color) {

    }

    @Override
    String getLicenceNumber() {
        return this.licenceNumber;
    }

}
