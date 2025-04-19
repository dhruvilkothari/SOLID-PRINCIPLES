package pieces;

import Board.Cell;
import enums.ChessPieceType;
import enums.Color;
import stratergy.BishopMovementStratergy;

public class Bishop extends Piece {
    public Bishop(String type, Color color, Cell startCell) {
        super(ChessPieceType.BISHOP.name(), color, new BishopMovementStratergy(),startCell);
    }
}
