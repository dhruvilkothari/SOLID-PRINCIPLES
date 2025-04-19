package stratergy;

import Board.Board;
import Board.Cell;

public interface MovementStratergy {
    public Boolean canMove(Board board, Cell start, Cell end);
}
