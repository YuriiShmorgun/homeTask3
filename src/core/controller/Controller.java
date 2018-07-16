package core.controller;

import core.model.Model;
import core.view.View;

import java.util.Locale;
import java.util.ResourceBundle;
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



view.Message();


    }

      private void selectLanguage () {
          String temp = scanner.next();
          if (temp.toCharArray().length == 1) {
              if (pattern.matcher(temp).find()) {

                  if (temp.equals("u")||temp.equals("U")){
                      view.setLanguage("ukr");
                  }
                  else if (temp.equals("e")||temp.equals("E")){
                      view.setLanguage("eng");
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


















