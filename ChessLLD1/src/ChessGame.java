import Board.Board;
import UtilityClass.Move;
import enums.Color;
import enums.Status;
import pieces.King;
import pieces.Piece;
import player.Player;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import Board.Cell;

public class ChessGame {

    private Board board;
    private Player player1;
    private Player player2;

    boolean isWhiteTurn;
    private ArrayList<Move> gameLog;
//    private ArrayList<Move> player2Logs;
    private Status status;

    public ChessGame(Player player1, Player player2,int row) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = Board.getInstance(row); // Initialize board with 8 rows
        this.isWhiteTurn = true;
        this.status = Status.ACTIVE;
        this.gameLog = new ArrayList<>();
    }

    public void start(){
        Scanner sc = new Scanner(System.in);

        while(this.status == Status.ACTIVE){
            Player currentPlayer = isWhiteTurn ? player1 : player2;
            System.out.println(currentPlayer.getName() + "'s turn. Enter move (startRow startCol endRow endCol):");
            int startRow = sc.nextInt();
            int startCol = sc.nextInt();
            int endRow = sc.nextInt();
            int endCol = sc.nextInt();
            Cell start = board.getCell()[startRow][ startCol];
            Cell end = board.getCell()[endRow][endCol];
            Optional<Piece> optionalPiece = start.getPiece();
            if(optionalPiece==null){
                continue;
            }
            Piece piece = optionalPiece.get();
            if ((piece.getColor() == Color.WHITE && !isWhiteTurn) ||
                    (piece.getColor() == Color.BLACK && isWhiteTurn)) {
                System.out.println("You cannot move the opponent's piece.");
                continue;
            }
            if (!piece.getMovementStratergy().canMove(board, start, end)) {
                System.out.println("Illegal move for that piece!");
                continue;
            }
            if (end.getPiece().isPresent() && end.getPiece().get().getColor() == piece.getColor()) {
                System.out.println("You cannot capture your own piece.");
                continue;
            }
            if (end.getPiece().isPresent() && end.getPiece().get().getColor() != piece.getColor()) {
               if(end.getPiece().get() instanceof King){
                   if(piece.getColor()==Color.WHITE){
                       status = Status.WHITE_WON;
                   }else{
                       status = Status.BLACK_WON;
                   }
               }
            }
            board.movePiece(start, end);
            Move move = new Move(piece, start, end);
            gameLog.add(move);
            isWhiteTurn = !isWhiteTurn;
        }

    }



}
