package factory;

import enums.Color;
import pieces.Pawn;
import pieces.Piece;

public class PawnPieceFactory implements PieceFactory {
    @Override
    public Piece createPiece(Color color, String type) {
        return new Pawn(type, color);
    }
}
