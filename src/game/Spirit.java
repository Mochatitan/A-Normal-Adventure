package spirits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Spirit{
  
protected String name;
protected int index;

protected int maxHealth;
protected int health;
protected int damage;
protected int defense;

protected double height;
protected double weight;
protected double size;
  
protected int level;
protected int exp;

protected Attack attack1;
protected Attack attack2;
protected Attack attack3;
protected Attack attack4;
  
public Spirit(){
loadName();
}
public Spirit(String name, int damage, int hp, int defense, Type type){
  this.name = name;
  this.damage = damage;
  this.health = hp;
  this.maxHealth = hp;
  this.defense = defense;
  this.type = type;
  
  this.level = 1;
  this.exp = 0;
  
  this.attack1 = new Tackle();
  this.attack2 = new Fireball();
  this.attack3 = new Splash();
  this.attack4 = new Headbutt();
}
private void loadName(){
this.name = this.getClass().getSimpleName();
} 
  
//getters and setters
public int getHealth(){
  return health;
}
public int getMaxHealth(){
return maxHealth;
}
public int getDamage(){
return damage
}
public int getDefense(){
return defense;
}
public boolean takeDamage(int damage){
this.health -= damage;
if(health <= 0){return false;}
return true;
}
public String getName(){
return name;
}
public int getIndex(){
  return index;
}
public int getLevel(){
return level;
}
public void setLevel(int newLevel){
level = newLevel;
}
public void addLevels(int levelsAdded){
level += levelsAdded;
}
public void levelUp(){
level++;
}



}
