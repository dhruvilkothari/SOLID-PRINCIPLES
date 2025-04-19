package pieces;

import enums.ChessPieceType;
import enums.Color;

public class King extends Piece {
    public King(String type, Color color) {
        super(ChessPieceType.KING.name(), color);
    }
}

