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
    int critical = 1;if(isCrit){critical = 2;}
    int level = attackingSpirit.getLevel();
    int power = "the power of the used move";
    int typeEffectiveness = 1;
    int typeEffectiveness2 = 1;
    int random = (217-255);
    
    double damage = (((2*level*critical)*power*attack/defense)/50)*typeEffectiveness*typeEffectiveness2*random;
    return damage;
  }

}
