package factory;

import Board.Cell;
import enums.Color;
import pieces.Piece;

public interface PieceFactory {

    public Piece createPiece(Color color, String type, Cell start);

}
