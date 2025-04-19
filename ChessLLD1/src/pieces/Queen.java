package pieces;

import enums.ChessPieceType;
import enums.Color;

public class Queen extends Piece {
    public Queen(String type, Color color) {
        super(ChessPieceType.QUEEN.name(), color);
    }
}
