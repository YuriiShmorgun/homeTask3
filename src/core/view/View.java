package core.view;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Yurii on 14.07.2018.
 */
public class View {

    public static final String FIRST_MESSAGE = "Доброго дня!\nДля роботи з прогамою Вам необхідно заповнити форму\n" +
            "Hello!\nTo work with the program you need to fill the form\n" +
            "Виберіть мову/Select language:\nU - Українська \nE - English";


    private static ResourceBundle resourceBundle;


    public static void startMessage() {
        System.out.println(FIRST_MESSAGE);
    }


    public void saveLanguage(String language) {
         resourceBundle = ResourceBundle.getBundle("property",new Locale(language));


    }
    public void printMessage (String message){
            System.out.println(resourceBundle.getString(message));
    }

}
