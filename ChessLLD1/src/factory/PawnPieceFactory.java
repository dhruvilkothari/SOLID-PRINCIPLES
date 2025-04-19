package factory;

import Board.Cell;
import enums.Color;
import pieces.Pawn;
import pieces.Piece;

public class PawnPieceFactory implements PieceFactory {
    @Override
    public Piece createPiece(Color color, String type, Cell start) {
        return new Pawn(type, color,start);
    }
}
