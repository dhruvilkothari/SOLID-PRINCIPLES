package Models.Board;


import Models.Helpers.Pair;
import Models.Pieces.ChessPiece;
import Models.Pieces.Piece;

import java.util.Optional;

public class Cell {

    private Optional<Piece> piece;

    private final Pair  position;

    public Cell(int x,int y) {
        this.position = new Pair(x,y);
        this.piece = Optional.empty();
    }

    public void setChessPiece(Piece chessPiece) {
        this.piece = Optional.of(chessPiece);
    }
    public Optional<Piece> getChessPiece() {
        return piece;
    }
    public Pair getPosition() {
        return position;
    }
    public void removeChessPiece() {
        this.piece = Optional.empty();
    }
    public boolean isEmpty() {
        return piece.isEmpty();
    }
    public int getX(){
        return position.getX();
    }
    public int getY(){
        return position.getY();
    }
    public boolean hasPiece(){
        return piece.isPresent();
    }
    public int getVerticalDistance(Cell cell){
        return Math.abs(this.getY() - cell.getY());
    }
    public int getHorizontalDistance(Cell cell){
        return Math.abs(this.getX() - cell.getX());
    }
}
