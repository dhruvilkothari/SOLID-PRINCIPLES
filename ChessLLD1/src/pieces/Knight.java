package pieces;

import Board.Cell;
import enums.ChessPieceType;
import enums.Color;
import stratergy.KnightMovementStratergy;

public class Knight extends Piece {
    public Knight(String type, Color color, Cell start) {
        super(ChessPieceType.KNIGHT.name(), color, new KnightMovementStratergy(),start);
    }
}
