package pingwit.lec_2.homework.task_9;

public class Task_9 {
    public static void main(String[] args) {
        /*

      000*
      00**
      0***
      ****
      ****
      0***
      00**
      000*

      */

        // i = 0; i <= 8; i++
        //


        for (int i = 2; i < 4; i++) {
            System.out.print("row=" + i + " ");

            for (int j = 0; j < 4; j++) {
                System.out.print(" column=" + j + " ");
            }

            System.out.println();
        }
    }

}
