package game;

import javax.swing.*;


public class Battle extends JFrame{
  public static final double CRIT_CHANCE = 0.05;
  public Spirit spirit1 = new Spirit("attackingPok",10, 20, 5, Type.FIRE);
  public Spirit spirit2 = new Spirit("defendingpok",12,18,4,Type.GRASS);
  
  public Battle(){
    initUI();
  }
  public void initUI(){
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  public double calculateDamage(Spirit attackingSpirit, Spirit defendingSpirit, Attack attackUsed){
    boolean isCrit = randomBoolean(Battle.CRIT_CHANCE);

  }

}
