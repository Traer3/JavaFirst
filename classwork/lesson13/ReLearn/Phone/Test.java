package com.hillel.classwork.lesson13.ReLearn.Phone;

public class Test {
    public static void main(String[] args) {

        AbstractPhone firstPhone = new ThomasEdisonPhone(1879);
        AbstractPhone phone = new Phone(1984);
        AbstractPhone videoPhone = new VideoPhone(2018);

        User user = new User("Лёха");
        user.callAnotherUser(224466,firstPhone);
        user.callAnotherUser(224466,phone);
        user.callAnotherUser(224466,videoPhone);

    }
}
