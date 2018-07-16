package core.model.person.sourse;

import java.util.List;

/**
 * 1.	Фамилия абонента
 2.	Имя абонента
 3.	Отчество абонента
 4.	Сформировать из введенных данных: Фамилия + Пробел + Первая буква Имени + точка
 5.	Никнейм
 6.	Комментарий
 7.	Группы в которую занесен абонент (Enum с названиями групп).
 8.	Телефон дом
 9.	Телефон моб.
 10.	Телефон моб. 2 (может отсутствовать)
 11.	Е-майл
 12.	Скайп
 13.	Адрес, состоящий из:
 - Индекс
 - город проживания
 - улица
 - номер дома
 - номер квартиры
 14.	Строка полного адреса сформированного из данных п.13.
 15.	Даты внесения записи в записную книжку
 16.	Даты последнего изменения записи

 */
public abstract class Person implements IPerson {

    private String surName;
    private String name;
    private String fathersName;
    private String nickName;
    private String comment;
    private String homePhone;
    private List<String> mobilePhoneList;
    private String email;
    private String skype;
    private String indexAddress;
    private String city;
    private String street;
    private String house;
    private String flat;
    private String createTime;
    private String changeTime;

  /*  public Person() {
    }*/

    public Person(String surName, String name, String fathersName, String nickName, String comment, String homePhone, List<String> mobilePhoneList, String email, String skype, String indexAddress, String city, String street, String house, String flat, String createTime, String changeTime) {
        this.surName = surName;
        this.name = name;
        this.fathersName = fathersName;
        this.nickName = nickName;
        this.comment = comment;
        this.homePhone = homePhone;
        this.mobilePhoneList = mobilePhoneList;
        this.email = email;
        this.skype = skype;
        this.indexAddress = indexAddress;
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
        this.createTime = createTime;
        this.changeTime = changeTime;
    }


    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public List<String> getMobilePhoneList() {
        return mobilePhoneList;
    }

    public void setMobilePhoneList(List<String> mobilePhoneList) {
        this.mobilePhoneList = mobilePhoneList;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getIndexAddress() {
        return indexAddress;
    }

    public void setIndexAddress(String indexAddress) {
        this.indexAddress = indexAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(String changeTime) {
        this.changeTime = changeTime;
    }
}
