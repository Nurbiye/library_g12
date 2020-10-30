package com.library.step_definitions;


import com.library.utils.BrowserUtil;
import com.library.utils.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class Hook {

    @Before
    public void setUp(Scenario scenario){

        System.out.println(scenario.getSourceTagNames());
        System.out.println("Start automation");
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @After
    public void driverDown(){

        BrowserUtil.wait(4);
        Driver.closeDriver();
        System.out.println("Automation is finished!!");

    }



}
