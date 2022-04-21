package pingwit.lec_5.classwork.point_1.interface_inheritence;

public interface Common extends AlwaysSleep {
}

interface AlwaysSleep extends NeverSleep, GoodNight {
    void sayHi();

}

interface NeverSleep extends GoodNight {
    void sayBye();

}

interface GoodNight {
    void Nalivai();

}

class Man implements AlwaysSleep {
    @Override
    public void sayHi() {

    }

    @Override
    public void sayBye() {

    }

    @Override
    public void Nalivai() {

    }

}
