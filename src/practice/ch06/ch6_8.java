package practice.ch06;

class PlayingCard {
    int kind;
    int num;

    static int width;
    static int height;

    PlayingCard(int k, int n) {
        kind = k;
        num = n;
    }
}

public class ch6_8 {

    public static void main(String[] args) {
        PlayingCard card = new PlayingCard(1,1);

    }
}
