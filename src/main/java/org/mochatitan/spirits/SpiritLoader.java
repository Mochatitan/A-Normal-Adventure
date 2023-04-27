package org.mochatitan.spirits;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.sargunvohra.lib.pokekotlin.client.PokeApi;
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient;
import me.sargunvohra.lib.pokekotlin.model.Pokemon;
import me.sargunvohra.lib.pokekotlin.model.PokemonSprites;
import org.json.simple.JSONObject;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class SpiritLoader {

    private ObjectMapper objectMapper = new ObjectMapper();
    private PokeApi pokeApi = new PokeApiClient();

    public void generateFiles() throws IOException {

        JSONObject obj = new JSONObject();

        for (int i = 1; i < 5 + 2; i++) {
            Pokemon pokemon = pokeApi.getPokemon(i);

            JSONObject tempObj = new JSONObject();
            tempObj.put("id", pokemon.getId());
            tempObj.put("name", pokemon.getName());
            tempObj.put("height", pokemon.getHeight());

            obj.put(pokemon.getName(), tempObj);


            PokemonSprites sprite = pokemon.getSprites();
            downloadSprite(pokemon.getName(), sprite.getFrontDefault());
            downloadSprite(pokemon.getName() + "-back", sprite.getBackDefault());
        }
        writeFile(obj);
    }

    public void writeFile(JSONObject obj) {
        try {

            FileWriter file = new FileWriter("src//main//resources//SpiritData//pokemonData.json");
            System.out.println("Loaded File");
            file.write(obj.toJSONString());
            file.flush();
            file.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void downloadSprite(String fileName, String imgURL) {
        try {
            URL url = new URL(imgURL);
            InputStream in = new BufferedInputStream(url.openStream());
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int n = 0;
            while (-1!=(n=in.read(buf)))
            {
                out.write(buf, 0, n);
            }
            out.close();
            in.close();
            byte[] response = out.toByteArray();

            FileOutputStream fos = new FileOutputStream("src//main//resources//SpiritSprites//" + fileName + ".png");
            fos.write(response);
            fos.close();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
