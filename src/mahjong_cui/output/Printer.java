package mahjong_cui.output;

import mahjong_cui.tile.Tile;

import java.util.List;

public final class Printer {
    //インスタンス化禁止
    private Printer() {

    }

    public static void printTiles(List<Tile> tileList) {
        for(int i = 0;i < tileList.size();i++) {
            System.out.print("┌　┐");
        }
        System.out.println();
        for (Tile tile : tileList) {
            System.out.print(tile.getTileString());
        }
        System.out.println();
        for(int i = 0;i < tileList.size();i++) {
            System.out.print("└　┘");
        }
    }
}
