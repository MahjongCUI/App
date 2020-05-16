package mahjong_cui.output;

import mahjong_cui.player.Player;
import mahjong_cui.tile.Tile;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public final class Printer {
    //インスタンス化禁止
    private Printer() {

    }

    private static final int MAX_TILE_STRING_ROW = 4;

    /*Tileを以下の形式の文字列に変形する。
        ┌　┐\n
         　 \n
         東 \n
        └　┘
     */
    private static String tileToShowString(Tile tile) {
        String tileString = tile.getTileString();

        if (tileString.length() == 1) {
            tileString = "　" + tileString;
        }

        return "┌　┐\n" +
                " " + tileString.charAt(0) + " \n" +
                " " + tileString.charAt(1) + " \n" +
                "└　┘";
    }

    private static String replaceBorderToSpace(String dust) {
        return dust.replace("┘", " ")
                .replace("┌", " ")
                .replace("└", " ")
                .replace("┐", " ");
    }

    public static void printPlayer(Player player) {
        System.out.println("捨て牌");
        printTiles(player.getCopyDiscards(), false);
        System.out.println("手牌");
        printTiles(player.getCopyHands(), true);
    }

    public static void printTiles(List<Tile> tileList, boolean needNumber) {
        //Tileをそれぞれ文字列に変形する。
        List<String> tileStringList = tileList.parallelStream()
                .map(Printer::tileToShowString)
                .collect(Collectors.toUnmodifiableList());

        //文字列のリストを、一行ずつのデータに変形する。
        Optional<String[]> optionalTileStringRows = tileStringList.parallelStream()
                .map(string -> string.split("\n"))
                .reduce((strings, strings2) -> {
                    String[] tileStringRows = new String[MAX_TILE_STRING_ROW];
                    for (int i = 0; i < strings.length; i++) {
                        tileStringRows[i] = strings[i] + strings2[i];
                    }
                    return tileStringRows;
                });

        if (needNumber) {
            //牌の番号を表示する。
            for (int i = 0; i < tileStringList.size(); i++) {
                System.out.printf("%1x", i);
                System.out.print(replaceBorderToSpace(tileStringList.get(i).split("\n")[0]).substring(1));
            }
            System.out.println();
        }
        //それぞれの行を表示する。
        optionalTileStringRows.ifPresent(rows -> Arrays.stream(rows).forEach(System.out::println));
    }
}
