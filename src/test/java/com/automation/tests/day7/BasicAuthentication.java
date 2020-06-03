package com.automation.tests.day7;


import javax.security.auth.login.Configuration;

public class BasicAuthentication {


    @Test

    public void spartanAuthentication(){


        baseURI= ConfigurationReader.getProperty("SPARTAN.URI");



    }


    public void authorizationTest(){


    }
}
