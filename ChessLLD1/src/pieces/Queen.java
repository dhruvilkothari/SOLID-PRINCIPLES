package pieces;

import Board.Cell;
import enums.ChessPieceType;
import enums.Color;
import stratergy.QueenMovementStratergy;

public class Queen extends Piece {
    public Queen(String type, Color color, Cell start) {
        super(ChessPieceType.QUEEN.name(), color, new QueenMovementStratergy(),start);
    }
}
