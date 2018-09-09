package ru.devstanis.gameXonix;

import java.awt.*;

public class Ball extends GameObject
{
    int x, y, dx, dy;

    public Ball(Game _g, int _x, int _y, int _dx, int _dy, Color _c)
    {
        this.game = _g;
        this.x = _x;
        this.y = _y;
        this.dx = _dx;
        this.dy = _dy;
        color = _c;
    }

    @Override
    public void paint(Graphics2D g)
    {
        g.setColor(color);
        g.fillOval(x-10, y - 10, 20, 20);
        //System.out.printf("ball x: %d, y: %d", x, y);
    }

    @Override
    public void move()
    {
        if(x >= game.fieldCoord[2]) dx *= -1;
        if(x <= game.fieldCoord[0]) dx *= -1;
        if(y <= game.fieldCoord[1]) dy *= -1;
        if(y >= game.fieldCoord[3]) dy *= -1;
        x += dx;
        y += dy;
    }
}
