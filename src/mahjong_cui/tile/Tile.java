package mahjong_cui.tile;

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
}
