package factory;

import enums.Color;
import pieces.Piece;
import pieces.Queen;

public class QueenPieceFactory implements PieceFactory {
    @Override
    public Piece createPiece(Color color, String type) {
        return new Queen(type, color);
    }
}