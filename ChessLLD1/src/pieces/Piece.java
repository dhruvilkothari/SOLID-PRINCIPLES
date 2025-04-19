package pieces;

import enums.Color;

public abstract class Piece {

    private String type;
    private Color color;
    private boolean isKilled;

    public Piece(String type, Color color) {
        this.type = type;
        this.color = color;
        this.isKilled = false;
    }
    public String  getType() {
        return type;
    }
    public Color getColor() {
        return color;
    }
    public boolean isKilled() {
        return isKilled;
    }
}
