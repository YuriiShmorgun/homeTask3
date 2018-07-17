package core.controller;

import core.model.Model;
import core.view.View;

import java.util.regex.*;

import java.util.Scanner;

/**
 * Created by Yurii on 14.07.2018.
 */
public class Controller {

    View view = new View();
    Model model = new Model();
    private static final String CHECK_LANGUAGE = "[UuEe]";






    Scanner scanner = new Scanner(System.in);
    Pattern pattern = Pattern.compile(CHECK_LANGUAGE);
    String language;

    public void start () {

        View.startMessage();

        selectLanguage();

        view.printMessage("HELLO_MESSAGE");
        view.printMessage("REQUEST_NAME");







    }

      private void selectLanguage () {
          String temp = scanner.next();
          if (temp.toCharArray().length == 1) {
              if (pattern.matcher(temp).find()) {

                  if (temp.equals("u")||temp.equals("U")){
                      view.saveLanguage("ukr");
                  }
                  else if (temp.equals("e")||temp.equals("E")){
                      view.saveLanguage("eng");
                  }
                  else selectLanguage();
              } else {
                  View.startMessage();
                  selectLanguage();
              }
          } else {
              View.startMessage();
              selectLanguage();
          }
      }
    }


















