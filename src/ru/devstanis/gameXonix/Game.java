package ru.devstanis.gameXonix;

import javax.swing.*;
import java.awt.*;

class Game extends JPanel
{
    GameObject[] gameObjects;

    public Game(GameObject...objects)
    {
        this.gameObjects = objects;
    }

    @Override
    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D)g;
        super.paint(g2d);
        for(GameObject o : gameObjects)
            o.paint(g2d);
    }

}

