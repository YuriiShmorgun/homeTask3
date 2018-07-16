package core;


import core.controller.Controller;
import core.model.factory.PersonFactory;
import core.model.person.sourse.Person;
import core.view.View;

import java.util.ArrayList;

/**
 * Created by Yurii on 14.07.2018.
 */
public class Main {


    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.start();

    }

}
