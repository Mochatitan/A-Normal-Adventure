package game.attacks;

public class Attack{
  
public int baseDamage;
protected int uses;
protected int maxUses;
protected Type type;
protected String name;
Attack(){
name = this.getClass().getSimpleName();
uses = maxUses;
}
