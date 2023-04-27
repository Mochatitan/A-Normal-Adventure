package org.mochatitan.game;

import java.util.ArrayList;

public class Trainer{

  public final String name;
  public int selectedPokemon = 0;
  public int pokemonInTeam;
  public Pokemon[] team;
    
  private int coins;
  public boolean[] gymsDefeated = {false,false,false,false,false,false,false,false};
  Trainer(final String name, Pokemon ... team){
    this.name = name;
    this.team = team;  //to be tested
    this.pokemonInTeam = team.length;
    this.coins = 120;
  }
  
  public int getCoins(){
    return coins;
  }
  

  

  
  
  

}
