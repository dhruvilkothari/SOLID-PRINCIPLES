package Models.Board;


import Models.Helpers.Pair;
import Models.Pieces.ChessPiece;

import java.util.Optional;

public class Cell {

    private Optional<ChessPiece> chessPiece;

    private final Pair  position;

    public Cell(int x,int y) {
        this.position = new Pair(x,y);
        this.chessPiece = Optional.empty();
    }

    public void setChessPiece(ChessPiece chessPiece) {
        this.chessPiece = Optional.of(chessPiece);
    }
    public Optional<ChessPiece> getChessPiece() {
        return chessPiece;
    }
    public Pair getPosition() {
        return position;
    }
    public void removeChessPiece() {
        this.chessPiece = Optional.empty();
    }
    public boolean isEmpty() {
        return chessPiece.isEmpty();
    }
    public int getX(){
        return position.getX();
    }
    public int getY(){
        return position.getY();
    }
    public boolean hasPiece(){
        return chessPiece.isPresent();
    }
}
