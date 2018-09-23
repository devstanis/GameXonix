package ru.devstanis.Balls;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class programLauncher
{
    public static void main(String[] args)
    {
        JFrame jf = new JFrame();
        jf.setTitle(Options.TITLE_OF_PROGRAM);
        jf.setSize(Options.FIELD_WIDTH,Options.FIELD_HEGHT);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);//center window

        Game game = new Game();
        ArrayList <GameObject> gameObjects = new ArrayList<GameObject>();
        for(int i = 0; i < Options.START_BALL_COUNT; i++)
            gameObjects.add(game.getRandomBall());

        game.addGameObjects(new Field(game), gameObjects);

        game.setPreferredSize(new Dimension(Options.FIELD_WIDTH, Options.FIELD_HEGHT));
        jf.add(game);
        jf.pack();
        jf.setVisible(true);

        game.startGame();
    }
}
