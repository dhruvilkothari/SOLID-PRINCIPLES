package pieces;

import Board.Cell;
import enums.ChessPieceType;
import enums.Color;
import stratergy.PawnMovementStratergy;

public class Pawn extends Piece {
    public Pawn(String type, Color color, Cell start) {
        super(ChessPieceType.PAWN.name(), color, new PawnMovementStratergy(),start);
    }

}
