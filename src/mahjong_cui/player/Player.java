package mahjong_cui.player;

import mahjong_cui.tile.Tile;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Player {
    private List<Tile> hands = new ArrayList<>();
    private List<Tile> discards = new ArrayList<>();

    protected Comparator<Tile> tileComparator = Comparator.comparingInt((Tile tile) -> tile.getTileType().ordinal()).thenComparingInt(Tile::getNumber);

    public List<Tile> getHands() {
        return hands;
    }

    public List<Tile> getDiscards() {
        return discards;
    }

    public void sortHands() {
        hands.sort(tileComparator);
    }

    @Override
    public String toString() {
        return "Player{" +
                "hands=" + hands +
                ", discards=" + discards +
                '}';
    }
}
