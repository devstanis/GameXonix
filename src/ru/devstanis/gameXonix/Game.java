package ru.devstanis.gameXonix;

import javax.swing.*;
import java.awt.*;

class Game extends JPanel
{
    GameObject[] gameObjects;
    int[] fieldCoord;

    public Game()
    {
        fieldCoord = new int[]{Options.FIELD_WIDTH / Options.BORDER_KOEFF,//x1
                          Options.FIELD_HEGHT / Options.BORDER_KOEFF,//y1
        Options.FIELD_WIDTH - (Options.FIELD_WIDTH / Options.BORDER_KOEFF)*2,//x2
        Options.FIELD_HEGHT - (Options.FIELD_HEGHT / Options.BORDER_KOEFF)*2};//y2
    }

    public void addGameObjects(GameObject...objects)
    {
        this.gameObjects = objects;
    }

    public void startGame()
    {
        go();
    }

    void go()
    {
        while(true)
        {
            for (GameObject go : gameObjects)
            {
                go.move();
                Delay.wait(Options.SHOW_DELAY);
                this.repaint();
            }
        }
    }

    void move()
    {
        for(GameObject o: gameObjects)
            o.move();
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

