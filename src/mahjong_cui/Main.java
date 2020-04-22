package mahjong_cui;

import mahjong_cui.tile.Tile;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Field field = new Field(Tile.tileSet(), new ArrayList<>());

        System.out.println("field.getDeck() = " + field.getDeck().toString().replace("},", "},\n"));
    }
}
