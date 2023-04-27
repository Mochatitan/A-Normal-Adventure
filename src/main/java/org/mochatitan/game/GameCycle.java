package org.mochatitan.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;
import javax.swing.JPanel;

public class GameCycle extends JPanel implements KeyListener, ActionListener {
    static String scene = "TitleScreen";
    private Timer timer;
    private static final int DELAY = 10;

    public GameCycle() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(true);
        timer = new Timer(DELAY, this);
        timer.start();
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        switch(GameCycle.scene){

        }
        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e){

        repaint();
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e){

    }
    @Override
    public void keyPressed(KeyEvent e){
        //System.out.println("keyPressed: " + e.getKeyCode());

    }
}