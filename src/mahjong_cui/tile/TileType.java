package mahjong_cui.tile;

import java.util.Comparator;

public enum TileType {
    Sozu(TileTypeType.NUMBER, "索"),
    Pinzu(TileTypeType.NUMBER, "筒"),
    Manzu(TileTypeType.NUMBER, "萬"),
    East(TileTypeType.WIND, "西"),
    South(TileTypeType.WIND, "南"),
    West(TileTypeType.WIND, "東"),
    North(TileTypeType.WIND, "北"),
    Haku(TileTypeType.DRAGON, "白"),
    Hatsu(TileTypeType.DRAGON, "撥"),
    Chun(TileTypeType.DRAGON, "中"),
    ;

    private final TileTypeType tileTypeType;
    private final String kanji;

    TileType(TileTypeType tileTypeType, String kanji) {
        this.tileTypeType = tileTypeType;
        this.kanji = kanji;
    }

    public boolean isNumTile() {
        return tileTypeType.isNumTile();
    }

    public boolean isWindTile() {
        return tileTypeType.isWindTile();
    }

    public boolean isDragonTile() {
        return tileTypeType.isDragonTile();
    }

    public String getKanjiValue() {
        return kanji;
    }

    //定義順に依存するので定義順をむやみに変更しないこと
    private static Comparator<TileType> comparator = Comparator.comparingInt(Enum::ordinal);

    public static Comparator<TileType> getComparator() {
        return comparator;
    }

    private enum TileTypeType {
        NUMBER {
            @Override
            public boolean isNumTile() {
                return true;
            }

            @Override
            public boolean isWindTile() {
                return false;
            }

            @Override
            public boolean isDragonTile() {
                return false;
            }
        }, WIND {
            @Override
            public boolean isNumTile() {
                return false;
            }

            @Override
            public boolean isWindTile() {
                return true;
            }

            @Override
            public boolean isDragonTile() {
                return false;
            }
        }, DRAGON {
            @Override
            public boolean isNumTile() {
                return false;
            }

            @Override
            public boolean isWindTile() {
                return false;
            }

            @Override
            public boolean isDragonTile() {
                return true;
            }
        };

        public abstract boolean isNumTile();

        public abstract boolean isWindTile();

        public abstract boolean isDragonTile();

    }
}
