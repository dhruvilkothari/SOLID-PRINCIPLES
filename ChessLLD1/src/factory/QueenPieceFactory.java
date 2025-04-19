package factory;

import Board.Cell;
import enums.Color;
import pieces.Piece;
import pieces.Queen;

public class QueenPieceFactory implements PieceFactory {
    @Override
    public Piece createPiece(Color color, String type, Cell start) {
        return new Queen(type, color, start);
    }
}