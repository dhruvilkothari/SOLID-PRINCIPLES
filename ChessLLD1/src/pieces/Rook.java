package pieces;

import Board.Cell;
import enums.ChessPieceType;
import enums.Color;
import stratergy.RookMovementStratergy;

public class Rook extends Piece {
    public Rook(String type, Color color, Cell start) {
        super(ChessPieceType.ROOK.name(), color,new RookMovementStratergy(),start);
    }
}
