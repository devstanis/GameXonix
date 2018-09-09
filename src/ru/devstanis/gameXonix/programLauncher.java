package ru.devstanis.gameXonix;

import javax.swing.*;
import java.awt.*;

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
        GameObject[] gameObjects =
                {
                        new Field(game),
                        new Ball(game, Options.FIELD_WIDTH/2, Options.FIELD_HEGHT/2, 5,5, Color.blue),
                        new Ball(game, Options.FIELD_WIDTH/3, Options.FIELD_HEGHT/4, 3,4, Color.red)
                };
        game.addGameObjects(gameObjects);
        game.setPreferredSize(new Dimension(Options.FIELD_WIDTH, Options.FIELD_HEGHT));
        jf.add(game);
        jf.pack();
        jf.setVisible(true);

        game.startGame();
    }
}
