package pingwit.lec_10.classwork.point_4;

public class GenericConstructor {

    private String season;

    public <T extends Season> GenericConstructor(T season) {
        this.season = season.getSeason();
    }

    @Override
    public String toString() {
        return "GenericConstructor{" +
            "season='" + season + '\'' +
            '}';
    }

}
