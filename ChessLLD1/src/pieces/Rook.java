package pieces;

import enums.ChessPieceType;
import enums.Color;

public class Rook extends Piece {
    public Rook(String type, Color color) {
        super(ChessPieceType.ROOK.name(), color);
    }
}
