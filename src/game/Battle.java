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
    //1 if it doesnt crit, 2 if it crits.
    int critical = 1;if(isCrit){critical = 2;}
    //level of the attacking spirit
    int level = attackingSpirit.getLevel();
    //power of the used move.
    int power = attackUsed.getPower();
    //type effectiveness of the attack vs the defending pokemon.scales from 0.5, 1, 2.
    int typeEffectiveness = 1;
    //todo
    int random = (217-255);
    
    double damage = (((2*level*critical)*power*attack/defense)/50)*typeEffectiveness*random;
    return damage;
  }

}
