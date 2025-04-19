package Board;

import enums.Color;
import factory.*;
import Board.Cell ;
import pieces.Piece;

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

        board[row][0] = new Cell(row, 0, new RookPieceFactory().createPiece(color, "Rook",new Cell(row,0,null)));
        board[row][1] = new Cell(row, 1, new KnightPieceFactory().createPiece(color, "Knight"),new Cell(row,0,null));
        board[row][2] = new Cell(row, 2, new BishopPieceFactory().createPiece(color, "Bishop"), new Cell(row,0,null));

        if (isWhite) {
            board[row][3] = new Cell(row, 3, new QueenPieceFactory().createPiece(color, "Queen"),new Cell(row,0,null));
            board[row][4] = new Cell(row, 4, new KingPieceFactory().createPiece(color, "King"),new Cell(row,0,null)));
        } else {
            board[row][3] = new Cell(row, 3, new KingPieceFactory().createPiece(color, "King"));
            board[row][4] = new Cell(row, 4, new QueenPieceFactory().createPiece(color, "Queen"));
        }

        board[row][5] = new Cell(row, 5, new BishopPieceFactory().createPiece(color, "Bishop"));
        board[row][6] = new Cell(row, 6, new KnightPieceFactory().createPiece(color, "Knight"));
        board[row][7] = new Cell(row, 7, new RookPieceFactory().createPiece(color, "Rook"));
    }
    public Cell[][] getCell() {
        return board;
    }


    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].getPiece().isPresent()) {
                    System.out.print(board[i][j].getPiece().get() + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }

    }

    public void movePiece(Cell start, Cell end) {
        Piece movingPiece = start.getPiece().get();
        if (movingPiece == null) return;

        // Optional: update internal state of the piece if needed (like firstMove flag for pawns, kings, rooks)
        movingPiece.setStartCell(end); // Update piece’s internal location
        end.setPiece(movingPiece); // Place piece on new cell
        start.setPiece(null);
    }
}
