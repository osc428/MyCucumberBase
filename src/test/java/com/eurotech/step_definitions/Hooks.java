package com.eurotech.step_definitions;

import com.eurotech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setup() {
        System.out.println("Before Method");
    }

   @After
    public void tearDown(Scenario scenario) throws Exception {
      if ( scenario.isFailed() ){
          final byte[]screenshot = (( TakesScreenshot )Driver.get()).getScreenshotAs(OutputType.BYTES);
          scenario.attach(screenshot,"image/png","screenshot");
      }
       Driver.closeDriver();
    }

    @Before("@db")
    public void setupDB() {
        System.out.println("Before Method for Database");
    }

    @After("@db")
    public void closeDB() throws Exception {
        System.out.println("After Method for Database");
    }
}
