package ru.devstanis.Balls;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class Game extends JPanel
{
    Field field;
    ArrayList <GameObject> gameObjects;
    int[] fieldCoord;
    int fieldWidth, fieldHeght, x1, y1, frameWidth, frameHeight;

    public Game()
    {
        fieldCoord = new int[]{Options.FIELD_WIDTH / Options.BORDER_KOEFF,//x1
                          Options.FIELD_HEGHT / Options.BORDER_KOEFF,//y1
        Options.FIELD_WIDTH - (Options.FIELD_WIDTH / Options.BORDER_KOEFF),//x2
        Options.FIELD_HEGHT - (Options.FIELD_HEGHT / Options.BORDER_KOEFF)};//y2
        frameWidth = Options.FIELD_WIDTH;
        frameHeight = Options.FIELD_HEGHT;
        fieldWidth = Options.FIELD_WIDTH - (Options.FIELD_WIDTH / Options.BORDER_KOEFF)*2;
        fieldHeght = Options.FIELD_HEGHT -(Options.FIELD_HEGHT / Options.BORDER_KOEFF)*2;
        x1 = fieldCoord[0];
        y1 = fieldCoord[1];
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
                {
                    GameObject go1 = gameObjects.get(i);
                    GameObject go2 = gameObjects.get(j);

                    gameObjects.remove(go1);
                    gameObjects.remove(go2);
                    gameObjects.add(getRandomBall());
                    gameObjects.add(getRandomBall());
                }
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
        int _r = Utils.getRandom(Options.MIN_BALL_RADIUS, Options.MAX_BALL_RADIUS);
        int _x = Utils.getRandom(x1+ _r, x1 + fieldWidth -_r);
        int _y = Utils.getRandom(y1+ _r, y1 + fieldHeght -_r);
        int _dx = Utils.getRandom(Options.MIN_BALL_SPEED, Options.MAX_BALL_SPEED) * Utils.getRandomBool();
        int _dy = Utils.getRandom(Options.MIN_BALL_SPEED, Options.MAX_BALL_SPEED) * Utils.getRandomBool();
        Color _color = Utils.getRandomColor();
        return new Ball(this,_x, _y, _r, _dx, _dy,_color);
    }


}

