package pingwit.lec_1.classwork.point_5;

public class TypeCasting {
    public static void main(String[] args) {
        byte myByte = 127;

        int myInt = 514;

        boolean myBoolean = true;
        double myDouble = 33.99;

        myByte = (byte) myInt;

//        myByte = (byte) myBoolean;

        myInt = (int) myDouble;

        myDouble = myInt;

        System.out.println("myByte=" + myByte); // -129 - 256
        System.out.println("myInt="+ myInt);
        System.out.println("myDouble="+ myDouble);

    }
}
