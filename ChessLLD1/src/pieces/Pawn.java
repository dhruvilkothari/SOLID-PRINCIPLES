package pieces;

import enums.ChessPieceType;
import enums.Color;

public class Pawn extends Piece {
    public Pawn(String type, Color color) {
        super(ChessPieceType.PAWN.name(), color);
    }

}
