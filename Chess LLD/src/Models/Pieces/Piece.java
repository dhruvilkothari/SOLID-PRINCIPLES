package Models.Pieces;

import Models.Helpers.Color;

public abstract class Piece {
    private boolean  killed;
    private final PieceName pieceName;
    private final Color color;

    public Piece(PieceName pieceName, Color color) {
        this.color = color;
        this.killed = false;
        this.pieceName = pieceName;
    }

    public boolean getKilled() {
        return killed;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }
    public PieceName getPieceName() {
        return pieceName;
    }
    public Color getColor() {
        return color;
    }


}
