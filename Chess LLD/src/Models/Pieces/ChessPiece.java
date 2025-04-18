package Models.Pieces;

import Models.Board.Cell;

public interface ChessPiece {

    boolean makeMove(Cell startingCell, Cell  endingCell);

    void setKilled(boolean killed);

    boolean  isKilled();
    boolean canMove(Cell startingCell, Cell  endingCell);

    void listPossibleMoves(Cell startingCell);

    boolean isMovingForFirstTime();
}
