package Models.Pieces;

import Models.Board.Cell;
import Models.Helpers.Color;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {
    private boolean  killed;
    private final PieceName pieceName;
    private final Color color;
    private List<Move> movesDone;

    public Piece(PieceName pieceName, Color color) {
        this.color = color;
        this.killed = false;
        this.pieceName = pieceName;
        this.movesDone = new ArrayList<>();
    }

    public boolean getKilled() {
        return killed;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }
    public PieceName getPieceName() {
        return pieceName;
    }
    public Color getColor() {
        return color;
    }

    public boolean isMovingForFirstTime() {
        return this.movesDone.isEmpty();
    }
    protected boolean isDiagonalMove(Cell startingCell, Cell endingCell) {
        return startingCell.getHorizontalDistance(endingCell) == 1 && startingCell.getVerticalDistance(endingCell) == 1;
    }
    protected boolean isMovingHorizontal(Cell startingCell, Cell endingCell) {
        return startingCell.getHorizontalDistance(endingCell) == 0 && startingCell.getVerticalDistance(endingCell) == 1;
    }
    protected boolean isMovingVertical(Cell startingCell, Cell endingCell) {
        return startingCell.getHorizontalDistance(endingCell) == 1 && startingCell.getVerticalDistance(endingCell) == 0;
    }


}
