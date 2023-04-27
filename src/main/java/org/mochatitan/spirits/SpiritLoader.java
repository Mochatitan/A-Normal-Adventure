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

public class SpiritLoader {

    private ObjectMapper objectMapper = new ObjectMapper();
    private PokeApi pokeApi = new PokeApiClient();

    public void generateFiles() throws IOException {
        for (int i = 1; i <= 9; i++) {
            Pokemon pokemon = pokeApi.getPokemon(i);

            JSONObject obj = new JSONObject();
            obj.put("name", pokemon.getName());
            obj.put("id", pokemon.getId());
            obj.put("height", pokemon.getHeight());

            PokemonSprites sprite = pokemon.getSprites();
            String imgURL = sprite.getFrontDefault();

            URL url = new URL(imgURL);
            InputStream in = new BufferedInputStream(url.openStream());
            System.out.println("Stream Opened");
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

            FileOutputStream fos = new FileOutputStream("src//main//resources//SpiritSprites//" + pokemon.getName() + ".png");
            fos.write(response);
            fos.close();
            System.out.println("File Wrote");

            try {

                FileWriter file = new FileWriter("src//main//resources//SpiritData//" + pokemon.getName() + ".json");
                System.out.println("Loaded File");
                file.write(obj.toJSONString());
                file.flush();
                file.close();

            } catch (IOException e) {
                System.out.println("Could not find path");
            }


        }
        System.exit(0);
    }
}
