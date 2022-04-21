package pingwit.lec_10.classwork.point_6;

public class WebServer {
    private Translator translator;

    public WebServer(Translator translator) {
        this.translator = translator;
    }

    public Translator getTranslator() {
        return translator;
    }

    public void setTranslator(Translator translator) {
        this.translator = translator;
    }

}
