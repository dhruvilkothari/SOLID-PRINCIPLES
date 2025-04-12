public class Player {
    private String name;
    private PieceType pieceType;
    private int currentPosition;

    public Player(String name, PieceType pieceType) {
        this.name = name;
        this.pieceType = pieceType;
        this.currentPosition = 1;
    }
    public String getName() {
        return name;
    }
    public PieceType getPieceType() {
        return pieceType;
    }
    public int getCurrentPosition() {
        return currentPosition;
    }
    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

}
