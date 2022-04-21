package pingwit.lec_4.classwork.point_4_5;

import pingwit.lec_4.classwork.point_3.Animal;

public class CarMain {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "9175");
        Car tesla = new Car("Tesla", "5121");

        System.out.println(bmw.fullCarName());
//        System.out.println(bmw.number);
//        System.out.println(bmw.producer);

        System.out.println(bmw);
        System.out.println(tesla);

        Animal animal = new Animal("lynx");
        System.out.println(animal.getName());
    }
}
