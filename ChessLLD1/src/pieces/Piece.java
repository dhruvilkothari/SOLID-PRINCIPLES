package pieces;

import Board.Cell;
import enums.Color;
import stratergy.MovementStratergy;

public abstract class Piece {

    private String type;
    private Color color;
    private boolean isKilled;
    private MovementStratergy movementStratergy;
    private Cell startCell;

    public Piece(String type, Color color, MovementStratergy movementStratergy, Cell startCell) {
        this.type = type;
        this.color = color;
        this.isKilled = false;
        this.movementStratergy = movementStratergy;
        this.startCell = startCell;

    }
    public String  getType() {
        return type;
    }
    public Color getColor() {
        return color;
    }
    public boolean isKilled() {
        return isKilled;
    }

    public Cell getStartCell() {
        return startCell;
    }
    public MovementStratergy getMovementStratergy() {
        return movementStratergy;
    }
    public void setStartCell(Cell startCell) {
        this.startCell = startCell;
    }
}
