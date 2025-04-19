package factory;

import Board.Cell;
import enums.Color;
import pieces.Knight;
import pieces.Piece;

public class KnightPieceFactory implements PieceFactory {
    @Override
    public Piece createPiece(Color color, String type, Cell start) {
        return new Knight(type, color, start);
    }
}
