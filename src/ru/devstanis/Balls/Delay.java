package ru.devstanis.Balls;

public class Delay
{
    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
