package mahjong_cui.tile;

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

    public boolean isDragonTile() {
        return tileTypeType.isDragonTile();
    }

    public boolean isWindTile() {
        return tileTypeType.isWindTile();
    }

    public String getKanjiValue() {
        return kanji;
    }

    private enum TileTypeType {
        NUMBER {
            @Override
            public boolean isNumTile() {
                return true;
            }

            @Override
            public boolean isDragonTile() {
                return false;
            }

            @Override
            public boolean isWindTile() {
                return false;
            }
        }, DRAGON {
            @Override
            public boolean isNumTile() {
                return false;
            }

            @Override
            public boolean isDragonTile() {
                return true;
            }

            @Override
            public boolean isWindTile() {
                return false;
            }
        }, WIND {
            @Override
            public boolean isNumTile() {
                return false;
            }

            @Override
            public boolean isDragonTile() {
                return false;
            }

            @Override
            public boolean isWindTile() {
                return true;
            }
        };

        public abstract boolean isNumTile();

        public abstract boolean isDragonTile();

        public abstract boolean isWindTile();
    }
}
