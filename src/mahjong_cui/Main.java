package mahjong_cui;

import mahjong_cui.tile.Tile;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Field field = new Field(Tile.tileSet(), new ArrayList<>());

        field.shuffle();

        System.out.println("field = " + field);
    }
}
