package pingwit.lec_10.classwork.point_5;

public class RockMain {
    public static void main(String[] args) {
        Rock<Genre> rock = new Rock<>(new Genre());

        Genre genre = rock.getGenre();
        System.out.println(genre.getGenre());

    }
}
