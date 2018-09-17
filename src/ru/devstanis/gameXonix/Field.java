package ru.devstanis.gameXonix;

import java.awt.*;

public class Field extends GameObject
{
    int fieldWidth, fieldHeght, x1, y1, frameWidth, frameHeight;

    public Field(Game _game)
    {
        game = _game;
        frameWidth = Options.FIELD_WIDTH;
        frameHeight = Options.FIELD_HEGHT;
        fieldWidth = Options.FIELD_WIDTH - (Options.FIELD_WIDTH / Options.BORDER_KOEFF)*2;
        fieldHeght = Options.FIELD_HEGHT -(Options.FIELD_HEGHT / Options.BORDER_KOEFF)*2;
        x1 = game.fieldCoord[0];
        y1 = game.fieldCoord[1];;
    }

    @Override
    public void paint(Graphics2D g)
    {
        paintBorder(g);
    }

    @Override
    public void move() {

    }

    @Override
    public boolean isInRange(int x, int y)
    {
        return false;
    }

    void paintBorder(Graphics2D g)
    {
        g.setColor(Color.black);
        g.fillRect(0,0,frameWidth, frameHeight);

        g.setColor(Color.green);
        g.drawRect(x1, y1, fieldWidth, fieldHeght);
    }
}

