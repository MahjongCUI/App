package mahjong_cui.tile.set;

import mahjong_cui.tile.Tile;

import java.util.List;

public class PongSet extends Set {
    public PongSet(List<Tile> tileList) {
        super(tileList);
    }

    @Override
    public boolean isValidTileList() {
        return false;
    }
}
