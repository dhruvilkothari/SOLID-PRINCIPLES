package stratergy;

import Board.Board;
import Board.Cell;
import enums.Color;
import pieces.Piece;

import java.util.Optional;

public class PawnMovementStratergy implements MovementStratergy{
    @Override
    public Boolean canMove(Board board, Cell start, Cell end) {
        Optional<Piece> piece = start.getPiece();
        if (piece.isEmpty()) {
            return false;
        }
        int startRow = start.getRow();
        int startCol = start.getCol();
        int endRow = end.getRow();
        int endCol = end.getCol();
        Piece piece1 = piece.get();
        Color color = piece1.getColor();
        int direction = color == Color.WHITE ? 1 : -1;
        if(endCol == startCol){
            if (end.getPiece().isEmpty() && end.getRow()== direction+startRow){
                return true;
            }
        }
        if (Math.abs(endCol - startCol) == 1 && endRow == startRow + direction) {
            Piece target = end.getPiece().get();
            if (target != null && target.getColor() != piece1.getColor()) {
                return true;
            }
        }
        return false;

    }
}
