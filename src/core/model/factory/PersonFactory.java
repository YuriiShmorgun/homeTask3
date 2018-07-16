package core.model.factory;

import core.model.person.Client;
import core.model.person.sourse.Group;

import java.util.List;

/**
 * Created by Yurii on 15.07.2018.
 */
public class PersonFactory /*implements IFactory*/{
    /*@Override*/
    public static Client createPerson(Client client) {
        return new Client(client.getSurName(), client.getName(),client.getFathersName(),client.getNickName(),
                client.getComment(), client.getHomePhone(), client.getMobilePhoneList(), client.getEmail(),
                client.getSkype(), client.getIndexAddress(), client.getCity(), client.getStreet(), client.getHouse(),
                client.getFlat(), client.getCreateTime(), client.getChangeTime());
    }


}
