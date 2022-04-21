package pingwit.lec_10.classwork.point_4;

public interface Season {
    String getSeason();
}

class Spring implements Season {
    @Override
    public String getSeason() {
        return "Spring";
    }

}

class Summer implements Season {
    @Override
    public String getSeason() {
        return "Summer";
    }

}
