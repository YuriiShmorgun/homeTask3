package core.model.person;

import core.model.exeption.LoginException;
import core.model.person.sourse.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yurii on 14.07.2018.
 */
public class Client extends Person {

   // private Group group;



    @Override
    public void edir() {

    }

    @Override
    public void create() {

    }

    @Override
    public void delete() {

    }


    public Client(String surName, String name, String fathersName, String nickName, String comment, String homePhone,
                  List<String> mobilePhoneList, String email, String skype, String indexAddress, String city, String street,
                  String house, String flat, String createTime, String changeTime /*Group group*/) {
        super(surName, name, fathersName, nickName, comment, homePhone, mobilePhoneList, email, skype, indexAddress, city, street, house, flat, createTime, changeTime);
       // this.group = group;





    }
}
