package pingwit.lec_12.classwork.part_1.point_4;

import java.util.function.Predicate;

public class FuncIntStaticExample {
    public static void main(String[] args) {
        FilterExample filterExample = integer -> integer < 20;

        FilterImpl filterImpl = new FilterImpl();

        FilterExample filterClass = filterImpl::filterKakUgodno;
        filterClass = filterImpl::filterKakUgodno;

        Predicate<Integer> testInteger = filterImpl::filterKakUgodno;
        Predicate<Integer> testIntegerLessFourty = integer -> integer < 40;

        Predicate<String> testString = filterImpl::filterString;
        Predicate<String> testStringStatic = (message) -> FilterImpl.staticFilter(message.length());

        Predicate<Integer> negate = testInteger
            .and(testIntegerLessFourty)
            .negate();

        boolean test = negate.test(50);
        System.out.println("Test=" + test);
    }
}

interface FilterExample {
    boolean filter(Integer x);
}

interface FilterStringExample {
    boolean filter(String x);
}

class FilterImpl {
    boolean filterKakUgodno(Integer x) {
        return staticFilter(x);
    }

    boolean filterString(String string) {
        return staticFilter(string.length());
    }

    static boolean staticFilter(Integer x) {
        return x > 20;
    }
}
