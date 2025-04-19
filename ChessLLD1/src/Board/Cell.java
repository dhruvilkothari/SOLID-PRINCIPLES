package Board;

import pieces.Piece;

import java.util.Optional;

public class Cell {
    private int row;
    private int col;
    private Optional<Piece> piece;

    public Cell(int row,int col, Piece piece){
        this.row = row;
        this.col = col;
        this.piece = Optional.ofNullable(piece);
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Optional<Piece> getPiece() {
        return piece;
    }
}
