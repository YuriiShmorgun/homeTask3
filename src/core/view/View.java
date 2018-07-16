package core.view;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Yurii on 14.07.2018.
 */
public class View {

    public static final String FIRST_MESSAGE = "Доброго дня!\nДля роботи з прогамою Вам необхідно заповнити форму\n" +
            "Hello!\nTo work with the program you need to fill the form\n" +
            "Виберіть мову/Select language:\nU -Українська \nE - English";

    private String language;



    public void setLanguage(String language) {
        this.language = language;
    }

    public static void startMessage() {
        System.out.println(FIRST_MESSAGE);
    }


    public void Message() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("property",new Locale(language));
        System.out.println(resourceBundle.getString("HELLO_MESSAGE") + "\n" + resourceBundle.getString("REQUEST_NAME"));

    }

}
