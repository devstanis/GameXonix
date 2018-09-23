package ru.devstanis.Balls;

import java.awt.*;

public class Field extends GameObject
{


    public Field(Game _game)
    {
        game = _game;
    }

    @Override
    public void paint(Graphics2D g)
    {
        paintBorder(g);
    }

    @Override
    public void move()
    {
    }

    @Override
    public boolean checkCross(GameObject go) {
        return false;
    }

    void paintBorder(Graphics2D g)
    {
        g.setColor(Color.black);
        g.fillRect(0,0,game.frameWidth, game.frameHeight);

        g.setColor(Color.green);
        g.drawRect(game.x1, game.y1, game.fieldWidth, game.fieldHeght);
    }
}

