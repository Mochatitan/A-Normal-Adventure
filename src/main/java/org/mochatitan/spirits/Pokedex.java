package org.mochatitan.spirits;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.sargunvohra.lib.pokekotlin.client.PokeApi;
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient;
import me.sargunvohra.lib.pokekotlin.model.Pokemon;
import me.sargunvohra.lib.pokekotlin.model.PokemonSprites;
import me.sargunvohra.lib.pokekotlin.model.PokemonType;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class Pokedex{

private HashMap<String, int> dex = new HashMap<String, int>();
private ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
  
public Pokedex(){
turnNamesToNumbers();
addPokemonToPokedex();
}
  /**
  *@param index the pokemons index, dont subtract 1 for lists, thats in the method.
  */
  public Pokemon get(int index){
    return pokedex.get(index-1);
  }
  public Pokemon get(String name){
    int index = dex.get(name);
    return pokedex.get(index-1);
  }
  
private void addPokemonToPokedex(){

}
private void turnNamesToNumbers(){
addToDex(“Bulbasaur”,“Ivysaur”,“Venusaur”,“Charmander”,“Charmeleon”,“Charizard”,“Squirtle”,“Wartortle”,“Blastoise”,“Caterpie”,“Metapod”,“Butterfree”,“Weedle”,“Kakuna”,“Beedrill”,“Pidgey”,“Pidgeotto”,“Pidgeot”,“Rattata”,“Raticate”,“Spearow”,“Fearow”,“Ekans”,“Arbok”,“Pikachu”,“Raichu”,“Sandshrew”,“Sandslash”,“Nidoran♀”,“Nidorina”,“Nidoqueen”,“Nidoran♂”,“Nidorino”,“Nidoking”,“Clefairy”,“Clefable”,“Vulpix”,“Ninetales”,“Jigglypuff”,“Wigglytuff”,“Zubat”,“Golbat”,“Oddish”,“Gloom”,“Vileplume”,“Paras”,“Parasect”,“Venonat”,“Venomoth”,“Diglett”,“Dugtrio”,“Meowth”,“Persian”,“Psyduck”,“Golduck”,“Mankey”,“Primeape”,“Growlithe”,“Arcanine”,“Poliwag”,“Poliwhirl”,“Poliwrath”,“Abra”,“Kadabra”,“Alakazam”,“Machop”,“Machoke”,“Machamp”,“Bellsprout”,“Weepinbell”,“Victreebel”,“Tentacool”,“Tentacruel”,“Geodude”,“Graveler”,“Golem”,“Ponyta”,“Rapidash”,“Slowpoke”,“Slowbro”,“Magnemite”,“Magneton”,“Farfetch’d”,“Doduo”,“Dodrio”,“Seel”,“Dewgong”,“Grimer”,“Muk”,“Shellder”,“Cloyster”,“Gastly”,“Haunter”,“Gengar”,“Onix”,“Drowzee”,“Hypno”,“Krabby”,“Kingler”,“Voltorb”,“Electrode”,“Exeggcute”,“Exeggutor”,“Cubone”,“Marowak”,“Hitmonlee”,“Hitmonchan”,“Lickitung”,“Koffing”,“Weezing”,“Rhyhorn”,“Rhydon”,“Chansey”,“Tangela”,“Kangaskhan”,“Horsea”,“Seadra”,“Goldeen”,“Seaking”,“Staryu”,“Starmie”,“Mr. Mime”,“Scyther”,“Jynx”,“Electabuzz”,“Magmar”,“Pinsir”,“Tauros”,“Magikarp”,“Gyarados”,“Lapras”,“Ditto”,“Eevee”,“Vaporeon”,“Jolteon”,“Flareon”,“Porygon”,“Omanyte”,“Omastar”,“Kabuto”,“Kabutops”,“Aerodactyl”,“Snorlax”,“Articuno”,“Zapdos”,“Moltres”,“Dratini”,“Dragonair”,“Dragonite”,“Mewtwo”,“Mew”);
}

  private void addToDex(String...name){
    for(int n = 1; n <= name[].length; n++){
      dex.put(name[n-1],n);
      dex.put(name(n-1].toLowerCase(),n);
      pokedex.add(pokeApi.getPokemon(n));
    }
  }
  public void getLength(){
return pokedex.length;
  }
  
}
