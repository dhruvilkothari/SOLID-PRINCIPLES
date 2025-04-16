public class Knight extends Piece{
//    private MovementStratergy moveStrategy ;
    public Knight(boolean isWhitePiece) {
        super(isWhitePiece, new KnightMovementStrategy());
    }
}
