package Models.Pieces;

import Models.Board.Cell;
import Models.Helpers.Color;
import Models.Helpers.Direction;
import exceptions.InvalidPieceMoveException;

public class Pawn extends Piece implements ChessPiece{


    public Pawn(PieceName pieceName, Color color) {
        super(pieceName,color);
    }

    @Override
    public boolean makeMove(Cell startingCell, Cell endingCell) {

        Direction direction  = getDirection(startingCell, endingCell);
        if(direction.equals(Direction.NONE) || getColor().equals(Color.WHITE) && direction.equals(Direction.BACKWARD_Y) || getColor().equals(Color.BLACK) && direction.equals(Direction.FORWARD_Y)){
            throw new InvalidPieceMoveException("Invalid move for pawn");
        }
        if(startingCell.getVerticalDistance(endingCell)>2){
            throw new InvalidPieceMoveException("Invalid move for pawn");
        }
        if(!isMovingForFirstTime() && startingCell.getVerticalDistance(endingCell) ==2){
            throw new InvalidPieceMoveException("Invalid move for pawn");
        }
        if(isMovingHorizontal(startingCell, endingCell)){
            throw new InvalidPieceMoveException("Invalid move for pawn");
        }
        if(endingCell.hasPiece() && !isMovingVertical(startingCell, endingCell)){
            throw new InvalidPieceMoveException("Invalid move for pawn");
        }
        if(endingCell.getChessPiece().get().getColor()!=this.getColor()){
            return true;
        }
        return true;


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

    @Override
    public boolean isMovingForFirstTime() {
        return this.isMovingForFirstTime();
    }

    public Color getColor() {
        return this.getColor();
    }


}
