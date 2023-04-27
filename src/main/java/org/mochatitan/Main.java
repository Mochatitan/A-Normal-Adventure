package org.mochatitan;

import org.mochatitan.game.App;
import org.mochatitan.spirits.SpiritLoader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        App app = new App();

        SpiritLoader loader = new SpiritLoader();
        loader.generateFiles();
    }
}