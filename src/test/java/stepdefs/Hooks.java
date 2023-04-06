package stepdefs;

import Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import readers.property.PropertyReader;

public class Hooks {


 @After
    public void after(){
     Driver.quitDriver();

    }
    boolean screenshot = PropertyReader.propertyReader().get("takescreenshot").equalsIgnoreCase("true");


}
