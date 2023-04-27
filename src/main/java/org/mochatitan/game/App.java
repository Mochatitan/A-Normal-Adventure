package org.mochatitan.game;

import javax.swing.JFrame;


public class App {

    public static final int WINDOW_WIDTH = 700;
    public static final int WINDOW_HEIGHT = 600;

    public App() {
        JFrame frame = new JFrame();
        GameCycle gameCycle = new GameCycle();
        frame.setBounds(10,10,WINDOW_WIDTH,WINDOW_HEIGHT);
        frame.setTitle("BRICK BREAKER");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gameCycle);
    }


}
