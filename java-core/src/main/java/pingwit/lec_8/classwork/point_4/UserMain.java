package pingwit.lec_8.classwork.point_4;

import pingwit.lec_8.classwork.point_3.MyCustomException;

import javax.security.auth.login.AccountException;

public class UserMain {
    public static void main(String[] args) throws Exception {
        User facebookUser = new FacebookUser();

        System.out.println(facebookUser.getName());
        System.out.println(facebookUser.getPassword("admin_000"));

    }
}
