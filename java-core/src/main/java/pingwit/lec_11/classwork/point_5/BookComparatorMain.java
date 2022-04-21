package pingwit.lec_11.classwork.point_5;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class BookComparatorMain {
    public static void main(String[] args) {
        BookYearComparator bookYearComparator = new BookYearComparator();
        BookNameComparator bookNameComparator = new BookNameComparator();

        Comparator<Book> yearBookComparator = bookNameComparator.thenComparing(bookNameComparator);

        Set<Book> books = new TreeSet<>(yearBookComparator);
        books.add(new Book("Potter", "Aushkin", 2012));
        books.add(new Book("APotter", "Dostoevskiy", 2012));
        books.add(new Book("Potter", "Aushkin", 2001));

        System.out.println(books);
    }
}
