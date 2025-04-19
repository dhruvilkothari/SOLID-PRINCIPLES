package factory;

import enums.ChessPieceType;
import enums.Color;
import pieces.Bishop;
import pieces.Piece;

public class BishopPieceFactory implements PieceFactory{
    @Override
    public Piece createPiece(Color color, String type) {
        return new Bishop(type,color);
    }
}
