package pingwit.lec_10.classwork.point_6;

public enum Translator {
    GOOGLE("google", "192.168.0.0") {
        @Override
        public String translateUrl(String word) {
            return String.format("https://translate.google.by/?sl=en&tl=ru&text=%s&op=translate", word);
        }
    },
    YANDEX("yandex", "192.168.0.4") {
        @Override
        public String translateUrl(String word) {
            return String.format("https://translate.yandex.ru/?lang=en-ru&text=%s", word);
        }
    };

    private String domain;
    private String ip;

    Translator(String domain, String ip) {
        this.domain = domain;
        this.ip = ip;
    }

    public String getDomain() {
        return domain;
    }

    public abstract String translateUrl(String word);
}
