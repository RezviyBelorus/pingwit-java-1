package pingwit.lec_11.classwork.point_5;

public record Book(String name, String author, int year) implements Comparable<Book> {

    @Override
    public int compareTo(Book book) {
        int nameResult = this.name.compareTo(book.name);

        if (nameResult != 0) {
            return nameResult;
        }

        int authorResult = this.author.compareTo(book.author);

        if (authorResult != 0) {
            return authorResult;
        }

        return this.year - book.year;
    }

}
