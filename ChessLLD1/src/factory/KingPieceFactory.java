package factory;

import Board.Cell;
import enums.Color;
import pieces.King;
import pieces.Piece;

public class KingPieceFactory implements PieceFactory {
    @Override
    public Piece createPiece(Color color, String type, Cell start) {
        return new King(type, color, start);
    }
}

