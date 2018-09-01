package ru.devstanis.gameXonix;

import java.awt.*;

public class Field extends GameObject
{
    int fieldWidth, fieldHeght, dx, dy;

    public Field()
    {
        fieldWidth = Options.FIELD_WIDTH;
        fieldHeght = Options.FIELD_HEGHT;
        dx = fieldWidth / 10;
        dy = fieldHeght / 10;
    }

    @Override
    public void paint(Graphics2D g)
    {
        paintBorder(g);
    }

    @Override
    public void move() {

    }

    void paintBorder(Graphics2D g)
    {
        g.setColor(Color.black);
        g.fillRect(0,0,fieldWidth,fieldHeght);

        g.setColor(Color.green);
        g.drawRect(dx, dy, fieldWidth - dx*2, fieldHeght - dy*2);
    }
}

