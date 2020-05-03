package mahjong_cui.tile;

public enum TileType {
    Sozu,
    Pinzu,
    Manzu,
    East,
    South,
    West,
    North,
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
            case East, South, West, North -> true;
            default -> false;
        };
    }

    public String getKanjiValue() {
        return switch (this) {
            case Sozu -> "索";
            case Pinzu -> "筒";
            case Manzu -> "萬";
            case East -> "東";
            case West -> "西";
            case North -> "北";
            case South -> "南";
            case Haku -> "白";
            case Hatsu -> "發";
            case Chun -> "中";
        };
    }
}
