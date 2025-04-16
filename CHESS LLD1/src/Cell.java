public class Cell {
    private int row;
    private int col;
    private Piece piece;

    public Cell(int row, int col, Piece piece) {
        this.row = row;
        this.col = col;
//        this.label = label;
        this.piece = piece;
    }
    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    public void removePiece() {
        this.piece = null;
    }
    public boolean isEmpty() {
        return piece == null;
    }

}
