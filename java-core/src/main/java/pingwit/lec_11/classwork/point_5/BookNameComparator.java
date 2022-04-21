package pingwit.lec_11.classwork.point_5;

import java.util.Comparator;

public class BookNameComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.name().compareTo(o2.name());
    }

}
