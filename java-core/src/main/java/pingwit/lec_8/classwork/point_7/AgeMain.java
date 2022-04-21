package pingwit.lec_8.classwork.point_7;

import pingwit.lec_8.classwork.point_4.FacebookUser;

public class AgeMain {
    public static void main(String[] args) throws Exception {

        FacebookUser facebookUser = new FacebookUser(17);

        Voenkomat voenkomat = new Voenkomat();

        Boolean isPrigoden = voenkomat.isPrigoden(facebookUser);

        if (isPrigoden) {
            System.out.println("Pozdravliaem");
        } else {
            System.out.println("Povezlo tebe drujok");
        }
    }

}
