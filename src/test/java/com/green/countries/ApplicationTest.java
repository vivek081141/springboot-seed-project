package com.green.countries;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringApplicationConfiguration(classes = Application.class)
public class ApplicationTest extends AbstractTransactionalTestNGSpringContextTests {


    @Test
    public void test() throws Exception {
        Thread.sleep(5000);
    }
}