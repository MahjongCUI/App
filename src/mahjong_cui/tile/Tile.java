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

    public final boolean isShuPai() {
        return tileType.isShuPai();
    }

    public boolean isSangenPai() {
        return tileType.isSangenPai();
    }

    public boolean isFonPai() {
        return tileType.isFonPai();
    }
}
