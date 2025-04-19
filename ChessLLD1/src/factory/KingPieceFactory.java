package factory;

import enums.Color;
import pieces.King;
import pieces.Piece;

public class KingPieceFactory implements PieceFactory {
    @Override
    public Piece createPiece(Color color, String type) {
        return new King(type, color);
    }
}

