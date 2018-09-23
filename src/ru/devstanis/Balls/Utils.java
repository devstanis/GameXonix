package ru.devstanis.Balls;

import java.awt.*;
import java.util.Random;

public class Utils
{
    static int getDistance(GameObject go1, GameObject go2)
    {
        double xx = Math.abs(go1.x - go2.x);
        double yy = Math.abs(go1.y - go2.y);
        return  (int) Math.sqrt(xx*xx + yy*yy);
    }

    static int getRandom(int max)
    {
        return (int)Math.random()* max;
    }

    static int getRandomBool()
    {
        return Math.random() > 0.5 ? 1: -1;
    }

    static Color getRandomColor()
    {
        return new Color(getRandom(255), getRandom(255), getRandom(255));
    }
}
