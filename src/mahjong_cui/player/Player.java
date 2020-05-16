package mahjong_cui.player;

import mahjong_cui.tile.Tile;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Player {
    private List<Tile> hands = new ArrayList<>();
    private List<Tile> discards = new ArrayList<>();

    protected Comparator<Tile> tileComparator = Comparator.comparingInt((Tile tile) -> tile.getTileType().ordinal()).thenComparingInt(Tile::getNumber);

    public void addHands(Tile tile) {
        hands.add(tile);
    }

    public List<Tile> getCopyHands() {
        return List.copyOf(hands);
    }

    public List<Tile> getCopyDiscards() {
        return List.copyOf(discards);
    }

    public void sortHands() {
        hands.sort(tileComparator);
    }

    public void discardHands() {
        System.out.println("捨てる牌を選択(数値)");

        Scanner scanner = new Scanner(System.in);
        scanner.useRadix(16);

        int select = scanner.nextInt();

        discards.add(hands.remove(select));
    }

    @Override
    public String toString() {
        return "Player{" +
                "hands=" + hands +
                ", discards=" + discards +
                '}';
    }
}
