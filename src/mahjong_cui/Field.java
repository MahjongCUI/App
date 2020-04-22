package mahjong_cui;

import mahjong_cui.player.Player;
import mahjong_cui.tile.Tile;

import java.util.Collections;
import java.util.List;

public class Field {
    private List<Tile> deck;
    private List<Player> playerList;

    public Field(List<Tile> deck, List<Player> players) {
        this.deck = deck;
        this.playerList = players;
    }

    /**
     * deckをシャッフルします。
     */
    public void shuffle() {
        Collections.shuffle(deck);
    }

    public List<Tile> getDeck() {
        return deck;
    }

    /**
     * deckから、新たな牌を渡します。deckからその牌は消滅します。
     *
     * @return ツモした牌
     */
    public Tile drawTile() {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Field{\ndeck={");

        for (int i = 0; i < deck.size(); i++) {
            Tile tile = deck.get(i);

            stringBuilder.append(tile).append(",");
            if (i % 8 == 0) {
                stringBuilder.append("\n");
            }
        }

        stringBuilder.append("\n},player = ").append(playerList).append("\n");

        return stringBuilder.toString();
    }
}
