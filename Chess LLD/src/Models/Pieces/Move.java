package Models.Pieces;

import Models.Board.Cell;

public class Move {
    private final Cell source;
    private final Cell destination;

    public Move(Cell source, Cell destination) {
        this.source = source;
        this.destination = destination;
    }
}
