package mahjong_cui.tile;

import java.util.ArrayList;
import java.util.List;

public class Tile {
    private final TileType tileType;
    private final int number;

    public Tile(TileType tileType, int number) {
        this.tileType = tileType;
        this.number = number;
    }

    public TileType getTileType() {
        return tileType;
    }

    public int getNumber() {
        return number;
    }

    public final boolean isNumTile() {
        return tileType.isNumTile();
    }

    public boolean isDragonTile() {
        return tileType.isDragonTile();
    }

    public boolean isWindTile() {
        return tileType.isWindTile();
    }

    public static List<Tile> tileSet() {
        List<Tile> tileList = new ArrayList<>();

        for (TileType value : TileType.values()) {
            for (int i = 0; i < 4 ; i++) {
                if (value.isNumTile()) {
                    for (int num = 1; num <= 9; num++) {
                        tileList.add(new Tile(value, num));
                    }
                } else {
                    tileList.add(new Tile(value, 0));
                }
            }
        }

        return tileList;
    }

    @Override
    public String toString() {
        return "Tile{" +
                "tileType=" + tileType +
                ", number=" + number +
                '}';
    }
}
