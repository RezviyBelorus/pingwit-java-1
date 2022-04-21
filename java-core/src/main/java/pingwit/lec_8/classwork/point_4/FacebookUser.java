package pingwit.lec_8.classwork.point_4;

import pingwit.lec_8.classwork.point_7.Age;

public class FacebookUser implements User {

    @Age(max = 32)
    private Integer age;

    public FacebookUser() {
    }

    public FacebookUser(Integer age) {
        this.age = age;
    }

    @Override
    public String getPassword(String password) {
        return password;
    }

    @Override
    public String getName() {
        return "Egorka";
    }


}
