

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board board;

    TicTacToeGame(int size){
        players = new LinkedList<>();
        Player player1 = new Player("Player1", new PieceTypeO());
        Player player2 = new Player("Player2", new PieceTypeX());
        players.add(player1);
        players.add(player2);
        board = new Board(size);
    }
    public Pair askChoice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column");

            int row = sc.nextInt();
            int col = sc.nextInt();
            return new Pair(row,col);


    }
    public String startGame(){
        boolean noWinner = true;
        while(noWinner){

            board.printBoard();
            Player player = players.removeFirst();
            ArrayList<Pair> freeCells = board.getFreeCells();
            if(freeCells.isEmpty()){
                noWinner = false;
                continue;
            }

            System.out.println("Player "+player.name+" turn");
            Pair pair = askChoice();


            boolean isCorrect = board.addPiece(pair, player.playingPiece);
            if (isCorrect==false){
                players.addFirst(player);
                continue;
            }
            players.addLast(player);
            boolean winner = board.isWinner(pair, player.playingPiece.pieceType);
            if(winner){
                return player.name;
            }
        }
        return "Tie";
    }
}
