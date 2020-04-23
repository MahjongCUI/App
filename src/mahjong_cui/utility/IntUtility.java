package mahjong_cui.utility;

public final class IntUtility {
    //インスタンス化禁止
    private IntUtility() {
    }

    public static String getKanjiFromNumber(int i) {
        return switch (i) {
            case 1 -> "一";
            case 2 -> "二";
            case 3 -> "三";
            case 4 -> "四";
            case 5 -> "五";
            case 6 -> "六";
            case 7 -> "七";
            case 8 -> "八";
            case 9 -> "九";

            default -> "";
        };
    }
}
