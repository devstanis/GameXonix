package ru.devstanis.Balls;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class Game extends JPanel
{
    Field field;
    ArrayList <GameObject> gameObjects;
    int[] fieldCoord;

    public Game()
    {
        fieldCoord = new int[]{Options.FIELD_WIDTH / Options.BORDER_KOEFF,//x1
                          Options.FIELD_HEGHT / Options.BORDER_KOEFF,//y1
        Options.FIELD_WIDTH - (Options.FIELD_WIDTH / Options.BORDER_KOEFF),//x2
        Options.FIELD_HEGHT - (Options.FIELD_HEGHT / Options.BORDER_KOEFF)};//y2
    }

    public void addGameObjects(Field _field, ArrayList<GameObject> objects)
    {
        field = _field;
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
            move();
        }
    }

    void move()
    {
        checkCross();
        for(GameObject o: gameObjects)
        {
            o.move();
        }
        Delay.wait(Options.SHOW_DELAY);
        this.repaint();
    }

    void checkCross()
    {
        int i;
        for(i =0 ; i<gameObjects.size() - 1; i++)
            for (int j = i+1; j < gameObjects.size(); j++)
            {
                if(gameObjects.get(i).checkCross(gameObjects.get(j)))
                    gameObjects.add(getRandomBall());
            }
    }

    @Override
    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D)g;
        super.paint(g2d);
        field.paint(g2d);
        for(GameObject o : gameObjects)
            o.paint(g2d);
    }

    public Ball getRandomBall()
    {
        int _x = Utils.getRandom(Options.FIELD_WIDTH - (Options.FIELD_WIDTH / Options.BORDER_KOEFF)*2);
        int _y = Utils.getRandom(Options.FIELD_HEGHT -(Options.FIELD_HEGHT / Options.BORDER_KOEFF)*2);
        int _r = Utils.getRandom(Options.MAX_BALL_RADIUS);
        int _dx = Utils.getRandom(Options.MAX_BALL_SPEED) * Utils.getRandomBool();
        int _dy = Utils.getRandom(Options.MAX_BALL_SPEED) * Utils.getRandomBool();
        Color _color = Utils.getRandomColor();
        return new Ball(this,_x, _y, _r, _dx, _dy,_color);
    }


}

