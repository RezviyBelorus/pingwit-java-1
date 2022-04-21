package pingwit.lec_12.classwork.part_1.point_2;

public class LambdaMethodExample {
    public static void main(String[] args) {
        LambdaMethod incrementByOne = x -> x++;

        LambdaMethod incrementDouble = x -> x *= 2;

        Integer incrementByOneResult = process(incrementByOne, 2);
        System.out.println(incrementByOneResult);

        Integer incrementDoubleResult = process(incrementDouble, 2);
        System.out.println(incrementDoubleResult);

        varArg("Egorka", "Olya");
    }


    private static Integer process(LambdaMethod lambdaMethod, Integer input) {
        return lambdaMethod.increment(input);
    }

    private static void varArg(String... names) {
        System.out.println(names[0]);
        System.out.println(names[1]);
    }
}

interface LambdaMethod {
    Integer increment(Integer integer);
}
