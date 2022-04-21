package pingwit.lec_2.homework.task_4;

public class Task_4 {
    public static void main(String[] args) {
        // * -> +
        // 2*3 -> 2+2+2 -> 3+3
        // 1. определить какое число больше
        // 2. i = 1; i<=2; i+1
        // 3. 0*9 -> 0
        // if(a != 0 && b != 0) {}
        // 4. -2 * 3 -> 2+2+2 -> (3+3)*(-1)
        // 5. boolean  isNegative = true/false

        int number = -3;
        boolean isNegative = false;

        int result = Math.abs(number);

        if (number < 0) {
            isNegative = true;
            number = -number;
        }

        System.out.println(number);
    }

}
