package factory;

import Board.Cell;
import enums.ChessPieceType;
import enums.Color;
import pieces.Bishop;
import pieces.Piece;

public class BishopPieceFactory implements PieceFactory{
    @Override
    public Piece createPiece(Color color, String type, Cell start) {
        return new Bishop(type,color,start);
    }
}
