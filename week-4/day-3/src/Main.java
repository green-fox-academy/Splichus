public class Main {
    public static void main(String[] args) {
        CowsAndBulls game = new CowsAndBulls();
        while (game.playing) {
            System.out.println(game.guess());
        }
    }
}
