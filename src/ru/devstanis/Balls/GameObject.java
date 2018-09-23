package ru.devstanis.Balls;

import java.awt.*;

public abstract class GameObject
{
    Game game;
    int x,y,r,dx,dy;
    public abstract void paint(Graphics2D g);
    public abstract void move();
    public abstract  boolean checkCross(GameObject go);
    Color color;


}

