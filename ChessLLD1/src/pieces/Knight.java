package pieces;

import enums.ChessPieceType;
import enums.Color;

public class Knight extends Piece {
    public Knight(String type, Color color) {
        super(ChessPieceType.KNIGHT.name(), color);
    }
}
