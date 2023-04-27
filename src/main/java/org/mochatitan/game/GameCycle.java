package org.mochatitan.game;

import me.sargunvohra.lib.pokekotlin.model.Pokemon;
import me.sargunvohra.lib.pokekotlin.client.PokeApi;
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient;

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
//scenes
/*
TITLESCREEN,BATTLE,LOADING_BATTLE,WALKING,CUTSCENE_01,SETTINGS
*/
public class GameCycle extends JPanel implements KeyListener, ActionListener {
    public static String scene = "TITLESCREEN";
    private Timer timer;
    private static final int DELAY = 10;
    private PokeApi pokeApi = new PokeApiClient();

    private Trainer player;
    private Battle battle;
   
    public GameCycle() {
        player = new Trainer("player1", pokeApi.getPokemon(4));
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(true);
        timer = new Timer(DELAY, this);
        timer.start();
    }
    public void tick(){
    //runs every DELAY milliseconds
        switch(scene){
            case "TITLESCREEN":
                
                break;
            case "BATTLE":
                battle.tick();
                
                break;
            case "LOADING_BATTLE":
                battle.loadingTick();
                
                break;
        }
    }
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        switch(scene){
            case "TITLESCREEN":
                
                break;
            case "BATTLE":
                battle.draw(g2d);
                break;
            case "LOADING_BATTLE":
                battle.loadingDraw(g2d);
                break;
        }
        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        tick();
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
    public void loadWildPokemonBattle(Pokemon pokemon){
        battle = new Battle(player,pokemon);
        scene = Scene.LOADING_BATTLE;
    }
}
