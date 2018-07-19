package core.model.factory;

import core.model.exeption.LoginException;
import core.model.person.Client;
import core.model.person.sourse.Group;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yurii on 15.07.2018.
 */
public class PersonFactory /*implements IFactory*/{
    /*@Override*/
    public static Client createPerson(Client client, ArrayList<Client> clients) throws LoginException {



        for (int i = 0; i<clients.size(); i++){
            if (clients.get(i).getNickName().equals(client.getNickName())){
                throw new LoginException("NickName is already exist");
            }
        }

        return new Client(client.getSurName(), client.getName(),client.getFathersName(),client.getNickName(),
                client.getComment(), client.getHomePhone(), client.getMobilePhoneList(), client.getEmail(),
                client.getSkype(), client.getIndexAddress(), client.getCity(), client.getStreet(), client.getHouse(),
                client.getFlat(), client.getCreateTime(), client.getChangeTime());







    }


}
