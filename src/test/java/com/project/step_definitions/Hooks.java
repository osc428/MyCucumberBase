package com.project.step_definitions;

import com.project.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setup() {

    }

   @After
    public void tearDown(Scenario scenario) throws Exception {
      if ( scenario.isFailed() ){
          final byte[]screenshot = (( TakesScreenshot )Driver.get()).getScreenshotAs(OutputType.BYTES);
          scenario.attach(screenshot,"image/png","screenshot");
      }
       Driver.closeDriver();
    }

}
