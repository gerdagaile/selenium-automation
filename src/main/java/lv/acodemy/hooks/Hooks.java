package lv.acodemy.hooks;

import io.cucumber.java.After;
import lv.acodemy.utils.LocalDriverManager;

public class Hooks {

    @After
    public static void afterTest() {
        LocalDriverManager.closeDriver();
    }
}
