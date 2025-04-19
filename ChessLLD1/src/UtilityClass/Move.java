package UtilityClass;

import Board.Cell;
import pieces.Piece;

public class Move {
    private Piece piece;
    private Cell start;
    private Cell end;
    public Move(Piece piece, Cell start, Cell end) {
        this.piece = piece;
        this.start = start;
        this.end = end;
    }
    public Piece getPiece() {
        return piece;
    }
    public Cell getStart() {
        return start;
    }
    public Cell getEnd() {
        return end;
    }
    public boolean isValidMove(){
        return true;
    }


}
