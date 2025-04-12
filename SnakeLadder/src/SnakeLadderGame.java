
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class SnakeLadderGame {
    private Board board;
    Deque<Player> players;
    public SnakeLadderGame(){
        board = new Board(100);
        players = new LinkedList<>();
        Player p1 = new Player("p1",new PieceGreen());
        Player p2 = new Player("p2", new PieceBlue());
        Player p3 = new Player("p3", new PieceRed());
        Player p4 = new Player("p4", new PieceYellow());
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        board.initializeBoard();
    }

    public String startGame(){
        boolean  noWinner = true;
        while(noWinner){
            Player player = players.removeFirst();

            int diceValue = board.rollDice();
            System.out.println(player.getName() + " rolled a " + board.rollDice());
            int newPosition = board.getNewPosition(player.getCurrentPosition(), diceValue);
            System.out.println(player.getName() + " rolled a " + diceValue + " and moved from " + player.getCurrentPosition() + " to " + newPosition);
            player.setCurrentPosition(newPosition);
            System.out.println(player.getName() + " moved to " + newPosition);
            if(board.isGameCompleted(newPosition)){
                noWinner =false;
                return player.getName();
            }
            players.addLast(player);
        }
        return "No Winner";
    }

}
