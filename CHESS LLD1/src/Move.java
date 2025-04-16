public class Move {
    private Cell startCell;
    private Cell  endCell;

    public Move(Cell startCell, Cell endCell) {
        this.startCell = startCell;
        this.endCell = endCell;
    }
    public Cell getStartCell() {
        return startCell;
    }
    public Cell getEndCell() {
        return endCell;
    }

    public boolean canMove(){
        if(startCell.getPiece() == null){
            return false;
        }
        if(startCell.getPiece().isWhite() != endCell.getPiece().isWhite()){
            return true;
        }
        return false;
    }
}
