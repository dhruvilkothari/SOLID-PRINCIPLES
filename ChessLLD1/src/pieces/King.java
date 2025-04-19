package pieces;

import Board.Cell;
import enums.ChessPieceType;
import enums.Color;
import stratergy.KingMovementStratergy;

public class King extends Piece {
    public King(String type, Color color, Cell start) {
        super(ChessPieceType.KING.name(), color, new KingMovementStratergy(),start);
    }
}

