package pingwit.lec_10.classwork.point_5;

public class Rock<T extends Genre> implements Music<T> {

    private T genre;

    public Rock(T genre) {
        this.genre = genre;
    }

    @Override
    public T getGenre() {
        return genre;
    }

}
