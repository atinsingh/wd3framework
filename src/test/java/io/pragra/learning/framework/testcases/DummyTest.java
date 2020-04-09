package io.pragra.learning.framework.testcases;

import io.pragra.learning.framework.config.Config;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DummyTest {
    @Test
    public void testProperty(){
        Object property = Config.getProperty("chrome.exe.path");
        System.out.println(property);
        Assert.assertEquals("/Users/atinsingh/Downloads/drivers/chromedriver",(String)property);
    }

    @Test
    public void nokeyProperty(){
        Object property = Config.getProperty("AwesomeWork");
        System.out.println(property);
    }
}
