package mahjong_cui.tile;

public enum TileType {
    Sozu(true, false, false),
    Pinzu(true, false, false),
    Manzu(true, false, false),
    Higashi(false, false, true),
    Minami(false, false, true),
    Nishi(false, false, true),
    Kita(false, false, true),
    Haku(false, true, false),
    Hatsu(false, true, false),
    Thun(false, true, false),
    ;

    private final boolean shuPai;
    private final boolean sangenPai;
    private final boolean fonPai;

    TileType(boolean shuPai, boolean sangenPai, boolean fonPai) {
        this.shuPai = shuPai;
        this.sangenPai = sangenPai;
        this.fonPai = fonPai;
    }

    public boolean isShuPai() {
        return shuPai;
    }

    public boolean isSangenPai() {
        return sangenPai;
    }

    public boolean isFonPai() {
        return fonPai;
    }
}
