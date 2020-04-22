package mahjong_cui;

import mahjong_cui.player.Player;
import mahjong_cui.tile.Tile;

import java.util.List;

public class Field {
    private List<Tile> deck;
    private List<Player> playerList;

    public Field(List<Tile> deck, List<Player> players) {
        this.deck = deck;
        this.shuffle();
        this.playerList = players;
    }

    /**
     * deckをシャッフルします。
     */
    public void shuffle() {

    }

    public List<Tile> getDeck() {
        return deck;
    }
}
