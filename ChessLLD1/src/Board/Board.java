package Board;

import enums.Color;
import factory.*;

public class Board {

    private  static Board instance;
    private Cell[][] board;

    private Board(int rows){
        initializeBoard(rows);
    }
    public static Board getInstance(int rows){
        if(instance == null){
            instance = new Board(rows);
        }
        return instance;
    }
    private void initializeBoard(int rows){
        board = new Cell[rows][rows];
        setPiece(0, true);
        setPawnPiece(1,rows, true);
        setPiece(rows-1, false);
        setPawnPiece(rows-2, rows, false);
    }

    private void setPawnPiece(int row, int rows, boolean isWhite){
        for(int i = 0; i < rows; i++){
            board[row][i] = new Cell(row,i, new PawnPieceFactory().createPiece(isWhite ? Color.WHITE : Color.BLACK, "Pawn"));
        }
    }

    private void setPiece(int row, boolean isWhite) {
        Color color = isWhite ? Color.WHITE : Color.BLACK;

        board[row][0] = new Cell(row, 0, new RookPieceFactory().createPiece(color, "Rook"));
        board[row][1] = new Cell(row, 1, new KnightPieceFactory().createPiece(color, "Knight"));
        board[row][2] = new Cell(row, 2, new BishopPieceFactory().createPiece(color, "Bishop"));

        if (isWhite) {
            board[row][3] = new Cell(row, 3, new QueenPieceFactory().createPiece(color, "Queen"));
            board[row][4] = new Cell(row, 4, new KingPieceFactory().createPiece(color, "King"));
        } else {
            board[row][3] = new Cell(row, 3, new KingPieceFactory().createPiece(color, "King"));
            board[row][4] = new Cell(row, 4, new QueenPieceFactory().createPiece(color, "Queen"));
        }

        board[row][5] = new Cell(row, 5, new BishopPieceFactory().createPiece(color, "Bishop"));
        board[row][6] = new Cell(row, 6, new KnightPieceFactory().createPiece(color, "Knight"));
        board[row][7] = new Cell(row, 7, new RookPieceFactory().createPiece(color, "Rook"));
    }


}
