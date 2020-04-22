package mahjong_cui;

import mahjong_cui.player.Player;
import mahjong_cui.tile.Tile;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<Tile> deck = new ArrayList<>(136);
    private List<Player> playerList = new ArrayList<>();

    public List<Tile> getDeck() {
        return deck;
    }
}
