package pingwit.lec_6.classwork.point_6;

public class Fibonacci {
    public static void main(String[] args) {
        // 1,1,2,3,5,8,13
        int begin = 1;
        int next = 1;
        int count = 6;

        int result = calculateFibonacci(begin, next, count);
        System.out.println("Result=" + result);

    }

    private static int calculateFibonacci(int begin, int next, int count) {
        int result = begin;
        if (count > 0) {
            count--;
            System.out.println("begin=" + begin);
            return calculateFibonacci(next, begin + next, count);
        }
        return result;
    }

}
