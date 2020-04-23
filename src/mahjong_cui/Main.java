package mahjong_cui;

import mahjong_cui.output.Printer;
import mahjong_cui.player.Player;
import mahjong_cui.tile.Tile;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        Field field = new Field(Tile.tileSet(), List.of(player));

        field.shuffle();

        player.getHands().add(field.drawTile());

        Printer.printTiles(player.getHands());
    }
}
