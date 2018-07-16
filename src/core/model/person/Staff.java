package core.model.person;

import core.model.person.sourse.IPerson;
import core.model.person.sourse.Person;

import java.util.List;

/**
 * Created by Yurii on 14.07.2018.
 */
public class Staff extends Person implements IPerson {

    public Staff(String surName, String name, String fathersName, String nickName, String comment, String homePhone, List<String> mobilePhoneList, String email, String skype, String indexAddress, String city, String street, String house, String flat, String createTime, String changeTime) {
        super(surName, name, fathersName, nickName, comment, homePhone, mobilePhoneList, email, skype, indexAddress, city, street, house, flat, createTime, changeTime);
    }

    @Override
    public void edir() {

    }

    @Override
    public void create() {

    }

    @Override
    public void delete() {

    }
}
