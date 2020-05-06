package mahjong_cui.tile.set;

import mahjong_cui.tile.Tile;

import java.util.List;

public abstract class Set {
    private List<Tile> tileList;

    public Set(List<Tile> tileList) {
        this.tileList = tileList;

        if (isValidTileList()) {
            throw new IllegalArgumentException("次の牌は正しくありません:" + tileList);
        }
    }

    public List<Tile> getCopyOfTileList() {
        return List.copyOf(tileList);
    }

    /**
     * 現在のTileListが正しいか検査する。
     * 継承したクラスはこれをオーバーライドする必要があります。但し、継承先で呼ぶ必要はありません。
     * @return TileListが正しいか。
     */
    public abstract boolean isValidTileList();
}
