package pingwit.lec_12.classwork.part_1.point_6;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class LambdaReturnMethodExample {
    public static void main(String[] args) {
        Operation operation = operationStrategy(Operator.MULTIPLY);

        Integer result = operation.process(5, 10);

        System.out.println(result);
    }

    private static Operation operationStrategy(Operator operator) {
        return switch (operator) {
            case SUM -> (x, y) -> x + y;
            case SUBTRACT -> (x, y) -> x - y;
            case MULTIPLY -> (x, y) -> x * y;
            case DIVIDE -> (x, y) -> x / y;
            default -> (x, y) -> x + y;
        };
    }

    private static BinaryOperator<Integer> operationStrategyBinaryOperator(Operator operator) {
        return switch (operator) {
            case SUM -> (x, y) -> x + y;
            case SUBTRACT -> (x, y) -> x - y;
            case MULTIPLY -> (x, y) -> x * y;
            case DIVIDE -> (x, y) -> x / y;
            default -> (x, y) -> x + y;
        };
    }

    private static BiFunction<Integer, Integer, Integer> operationStrategyBiFunction(Operator operator) {
        return switch (operator) {
            case SUM -> (x, y) -> x + y;
            case SUBTRACT -> (x, y) -> x - y;
            case MULTIPLY -> (x, y) -> x * y;
            case DIVIDE -> (x, y) -> x / y;
            default -> (x, y) -> x + y;
        };
    }
}


interface Operation {
    Integer process(Integer x, Integer y);
}

enum Operator {
    SUM,
    SUBTRACT,
    MULTIPLY,
    DIVIDE
}
