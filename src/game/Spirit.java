package game;



public abstract class Spirit{
protected String name;
protected int index;
protected int level;
  
protected int maxHealth;
protected int health;
protected int damage;
protected int defense;

protected double height;
protected double weight;
protected double size;

protected Personality personality;
  

  
  
//getters and setters
public String getName(){
return name;
}
public int getIndex(){
  return index;
}
public int getLevel(){
return level;
}

}
