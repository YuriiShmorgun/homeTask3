package core.model;

import core.model.exeption.LoginException;
import core.model.factory.PersonFactory;
import core.model.person.Client;
import core.model.person.sourse.Person;

import java.util.ArrayList;

/**
 * Created by Yurii on 14.07.2018.
 */
public class Model {



    private ArrayList<Client> clientArrayList = new ArrayList<>();

    public void addClient (Client client){
        try {
            clientArrayList.add(PersonFactory.createPerson(client, clientArrayList));
        } catch (LoginException e) {
            e.printStackTrace();
        }



}





    }


