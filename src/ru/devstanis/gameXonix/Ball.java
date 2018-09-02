package ru.devstanis.gameXonix;

import java.awt.*;

public class Ball extends GameObject
{
    int x, y;

    public Ball(int _x, int _y)
    {
        this.x = _x;
        this.y = _y;
    }

    @Override
    public void paint(Graphics2D g)
    {
        g.setColor(Color.red);
        g.fillOval(x-10, y - 10, 20, 20);
    }

    @Override
    public void move()
    {

    }
}
