package ru.devstanis.gameXonix;

import java.awt.*;

public abstract class GameObject
{
    Game game;
    public abstract void paint(Graphics2D g);
    public abstract void move();
    Color color;
}

