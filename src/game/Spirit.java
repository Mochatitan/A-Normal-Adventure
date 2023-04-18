package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Spirit{
  
protected String name;
protected int index;

protected int maxHealth;
protected int health;
protected int damage;
protected int defense;

protected double height;
protected double weight;
protected double size;

protected Personality personality;
  
protected int level;
protected double totalExp;
protected double exp;
protected ArrayList<double> expRequirement = new ArrayList<double>();
  
  
public Pokemon(){
loadVariables();
}
  
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
public void setLevel(int newLevel){
level = newLevel;
}
public void addLevels(int levelsAdded){
level += levelsAdded;
}
public void levelUp(){
level++;
}
private int calculateLevel(){
while(exp > expRequirements.get(level)){
exp -= expRequirements.get(level);
level++;
}
}

//loaders
private void loadVariables(){
loadExpRequirement();
loadInformation();
}
  
private void loadExpRequirement(){
//expRequirement = new ArrayList<int>(Arrays.asList(0,2,3,4,4,5,7,));
private double xpReq = 1;
for(double x = 0; x < 98;x+=0.5){
expRequirement.add(xpReq);
xpReq += x;
}
}
private void loadInformation(){
this.name = this.getClass().getSimpleName();
}
  
private void randomizeStats(){

}


}
