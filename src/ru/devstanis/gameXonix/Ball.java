package ru.devstanis.gameXonix;

import java.awt.*;

public class Ball extends GameObject
{
    int x, y, r, dx, dy;

    public Ball(Game _g, int _x, int _y, int _r, int _dx, int _dy, Color _c)
    {
        this.game = _g;
        this.x = _x;
        this.y = _y;
        this.r = _r;
        this.dx = _dx;
        this.dy = _dy;
        color = _c;
    }

    @Override
    public void paint(Graphics2D g)
    {
        g.setColor(color);
        g.fillOval(x-r, y - r, r*2, r*2);
        //System.out.printf("ball x: %d, y: %d", x, y);
    }

    @Override
    public void move()
    {
        if(x+r >= game.fieldCoord[2]) dx *= -1;
        if(x - r <= game.fieldCoord[0]) dx *= -1;
        if(y - r <= game.fieldCoord[1]) dy *= -1;
        if(y +r >= game.fieldCoord[3]) dy *= -1;

        x += dx;
        y += dy;
    }

    @Override
    public boolean isInRange(int x, int y) {
        return false;
    }
}
