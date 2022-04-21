package pingwit.lec_12.classwork.part_1.point_5;

public class FuncConstructorExample {
    public static void main(String[] args) {
//        FuncUser netflixUser = userName -> new NetflixUser(userName);
        FuncUser netflixUser = NetflixUser::new;


        NetflixUser egorka = netflixUser.supply("Egorka", 56);
    }
}

interface FuncUser {
    NetflixUser supply(String name, Integer age);
}

record NetflixUser(String name, Integer age) {

    NetflixUser() {
        this("Default user name", 45);
    }

    NetflixUser(String name, Integer age) {
        System.out.println("Hello from 1 arg constructor");
        this.name = name;
        this.age = age;
    }

}
