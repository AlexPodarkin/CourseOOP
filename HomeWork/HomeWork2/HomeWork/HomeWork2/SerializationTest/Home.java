package HomeWork.HomeWork2.SerializationTest;

import java.io.*;

class Home implements Serializable 
{
    private String home;

    public Home(String home) 
    {
        this.home = home;
    }

    public String getHome() 
    {
        return home;
    }
}
