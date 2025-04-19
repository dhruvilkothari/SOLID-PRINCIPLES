package factory;

import enums.Color;
import pieces.Knight;
import pieces.Piece;

public class KnightPieceFactory implements PieceFactory {
    @Override
    public Piece createPiece(Color color, String type) {
        return new Knight(type, color);
    }
}
