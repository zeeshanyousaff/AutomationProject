package com.amazon.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

    Properties prop;

    public ReadConfig() {

        try{
        FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/Configurations/config.properties");
        prop=new Properties();
        prop.load(fis);
        }
        catch (Exception e)
        {
            System.out.println("Exception: "+e.getMessage());
        }

    }

    public String getURL()
    {
      String s=prop.getProperty("URL");
      return s;
    }

    public String getHomePageTitle()
    {
        String t=prop.getProperty("HomePageTitle");
        return t;
    }

}
