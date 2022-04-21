package pingwit.lec_8.classwork.point_4;

import pingwit.lec_8.classwork.point_3.MyCustomException;

import javax.security.auth.login.AccountException;

public interface User {

    String getPassword(String password) throws MyCustomException, AccountException;

    String getName() throws AccountException;
}
