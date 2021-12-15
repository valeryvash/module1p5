package point1.basepatterns.behavioral.template.wikiexample;

public class GameManager {
    public static void main(String[] args) {
        final GameCode gameCode = GameCode.CHESS;

        Game game = null;

        switch (gameCode) {
            case CHESS -> game = new Chess();
            case MONOPOLY -> game = new Monopoly();
            default -> new IllegalArgumentException("No such game");
        }

        game.playOneGame(2);
    }
}
