package ru.devstanis.gameXonix;

import java.awt.*;

public class Field extends GameObject
{
    int fieldWidth, fieldHeght, x1, x2, y1, y2;

    public Field(Game _game)
    {
        game = _game;

        fieldWidth = Options.FIELD_WIDTH;
        fieldHeght = Options.FIELD_HEGHT;
        x1 = game.fieldCoord[0];
        y1 = game.fieldCoord[1];;
        x2 = game.fieldCoord[2];;
        y2 = game.fieldCoord[3];;

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
        //g.drawRect(dx, dy, fieldWidth - dx*2, fieldHeght - dy*2);
        g.drawRect(x1, y1, x2, y2);
    }
}

