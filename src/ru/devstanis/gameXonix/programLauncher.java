package ru.devstanis.gameXonix;

import javax.swing.*;

public class programLauncher
{
    public static void main(String[] args)
    {
        JFrame jf = new JFrame();
        jf.setTitle(Options.TITLE_OF_PROGRAM);
        jf.setSize(Options.FIELD_WIDTH,Options.FIELD_HEGHT);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);//center window
        jf.setVisible(true);

        GameObject[] gameObjects =
                {
                        new Field(),
                        new Ball(Options.FIELD_WIDTH/2, Options.FIELD_HEGHT/2)
                };
        jf.add(new Game(gameObjects));
    }
}
