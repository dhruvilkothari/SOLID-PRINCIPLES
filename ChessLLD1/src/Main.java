import enums.Color;
import player.Player;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Player 1", Color.WHITE);
        Player player2 = new Player("Player 2", Color.BLACK);
        ChessGame game = new ChessGame(player1,player2,8);
        game.start();
    }
}