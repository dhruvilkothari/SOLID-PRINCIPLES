import java.util.ArrayList;

public class Board {
    int size;
    PieceType [][]board;
    public Board(int size){
        this.size=size;
        board=new PieceType[size][size];
    }

    void printBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]!=null){
                    System.out.print(board[i][j]);
                }
                else{
                    System.out.print(" ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public ArrayList<Pair> getFreeCells(){
        ArrayList<Pair> freeCells = new ArrayList<>();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==null){
                    Pair pair = new Pair(i,j);
                    freeCells.add(pair);
                }
            }
        }
        return freeCells;
    }


    public boolean addPiece(Pair pair, PlayingPiece playingPiece) {
        int row = pair.x;
        int col = pair.y;
        if (board[row][col] != null || row>=size || col>=size || row<0 || col<0) {
            return false;
        }
        board[row][col] = playingPiece.pieceType;
        return true;

    }

    public boolean isWinner(Pair pair, PieceType pieceType) {
        int row = pair.x;
        int col = pair.y;
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int j=0;j<size;j++){
            if(board[row][j]!=pieceType){
                rowMatch = false;
            }
        }
        //need to check in column
        for(int i=0;i<size;i++){
            if(board[i][col]!=pieceType){
                columnMatch = false;
            }
        }
        //need to check diagonals
        for(int i=0, j=0;i<size;i++,j++){
            if(board[i][j]!=pieceType){
                diagonalMatch = false;
            }
        }
        //need to check anti-diagonals
        for(int i=0, j=size-1;i<size;i++, j--){
            if(board[i][j]!=pieceType){
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
