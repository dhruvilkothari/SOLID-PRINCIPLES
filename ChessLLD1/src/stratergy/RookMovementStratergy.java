package stratergy;

import Board.Board;
import Board.Cell;

public class RookMovementStratergy implements MovementStratergy{
    @Override
    public Boolean canMove(Board board, Cell start, Cell end) {
        return true;
    }
}
