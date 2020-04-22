package mahjong_cui.tile;

public enum TileType {
    Sozu,
    Pinzu,
    Manzu,
    Higashi,
    Minami,
    Nishi,
    Kita,
    Haku,
    Hatsu,
    Chun,
    ;

    public boolean isNumTile() {
        return switch (this) {
            case Sozu, Pinzu, Manzu -> true;
            default -> false;
        };
    }

    public boolean isDragonTile() {
        return switch (this) {
            case Haku, Hatsu, Chun -> true;
            default -> false;
        };
    }

    public boolean isWindTile() {
        return switch (this) {
            case Higashi, Minami, Nishi, Kita -> true;
            default -> false;
        };
    }
}
