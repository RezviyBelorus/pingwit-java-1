package pingwit.lec_7.classwork.point_3_4;

public class BenchmarkStringMain {
    public static void main(String[] args) {
        String myString = "";
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        int count = 400_000;

        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            myString = myString.concat("A");
        }
        long finish = System.currentTimeMillis();
        System.out.println("String=" + (finish - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            stringBuilder.append("A");
        }
        finish = System.currentTimeMillis();
        System.out.println("StringBuilder=" + (finish - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            stringBuffer.append("A");
        }
        finish = System.currentTimeMillis();
        System.out.println("StringBuffer=" + (finish - start));

    }
}
