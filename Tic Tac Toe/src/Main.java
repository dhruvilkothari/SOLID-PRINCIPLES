public class Main {
    public static void main(String[] args) {

        TicTacToeGame  game = new TicTacToeGame(4);
        System.out.println("Game winner is: " + game.startGame());
    }
}