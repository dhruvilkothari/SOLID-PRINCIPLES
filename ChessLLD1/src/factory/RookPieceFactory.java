package factory;

import Board.Cell;
import enums.Color;
import pieces.Piece;
import pieces.Rook;

public class RookPieceFactory implements PieceFactory {
    @Override
    public Piece createPiece(Color color, String type, Cell start) {
        return new Rook(type, color,start);
    }
}

