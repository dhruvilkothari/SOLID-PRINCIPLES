
public abstract class Piece {
    private final boolean isWhitePiece;
    private boolean isKilled;
    private MovementStratergy movementStrategy;

    public Piece(boolean isWhitePiece, MovementStratergy movementStrategy) {
        this.isWhitePiece = isWhitePiece;
        this.isKilled = false;
        this.movementStrategy = movementStrategy;
    }

    public boolean isWhite() {
        return isWhitePiece;
    }
    public boolean isKilled() {
        return isKilled;
    }

    public void setKilled(boolean isKilled) {
        this.isKilled = isKilled;
    }
    public boolean canMove(Board board,
                                    Cell startCell, Cell endCell) {
        return movementStrategy.canMove(board,startCell,endCell);
    }
}
