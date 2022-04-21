package pingwit.lec_5.classwork.point_2_3;

public abstract class AbstractTesla extends FigEgoZnaet {
    protected String licenceNumber;

    public AbstractTesla(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    abstract String getLicenceNumber();

    String login(String login, String password) {
        return "Logged in to the system:" + login + ":" + password;
    }
}
