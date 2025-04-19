package factory;

import enums.Color;
import pieces.Piece;
import pieces.Rook;

public class RookPieceFactory implements PieceFactory {
    @Override
    public Piece createPiece(Color color, String type) {
        return new Rook(type, color);
    }
}

