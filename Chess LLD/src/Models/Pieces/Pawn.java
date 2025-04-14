package Models.Pieces;

import Models.Board.Cell;
import Models.Helpers.Color;

public class Pawn extends Piece implements ChessPiece{


    public Pawn(PieceName pieceName, Color color) {
        super(pieceName,color);
    }

    @Override
    public void makeMove(Cell startingCell, Cell endingCell) {

    }

    @Override
    public void setKilled(boolean killed) {
        this.setKilled(killed);
    }

    @Override
    public boolean isKilled() {
        return this.isKilled();
    }

    @Override
    public boolean canMove(Cell startingCell, Cell endingCell) {
        return false;
    }

    @Override
    public void listPossibleMoves(Cell startingCell) {

    }
}
