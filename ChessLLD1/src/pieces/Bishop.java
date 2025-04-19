package pieces;

import enums.ChessPieceType;
import enums.Color;

public class Bishop extends Piece {
    public Bishop(String type, Color color) {
        super(ChessPieceType.BISHOP.name(), color);
    }
}
