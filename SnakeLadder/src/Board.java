import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private Dice dice;
    private List<Snake> snakes;
    private List<Ladder> ladders;

    Board(int size){

        this.size = size;
        this.dice = new Dice(1);
        this.snakes = new ArrayList<>();
        this.ladders = new ArrayList<>();
    }
    public void initializeBoard(){
        this.snakes.add(new Snake(10,2));
        this.snakes.add(new Snake(99,12));
        this.snakes.add(new Snake(15, 6));
        this.snakes.add(new Snake(95, 75));
        this.ladders.add(new Ladder(5,25));
        this.ladders.add(new Ladder(40,89));
        this.ladders.add(new Ladder(50, 70));
        this.ladders.add(new Ladder(60, 85));
    }

    public int rollDice() {
        return dice.rollDice();
    }

    public int getNewPosition(int currentPosition, int diceValue) {
        int newPosition = currentPosition + diceValue;
        if(newPosition > size){
            return currentPosition;
        }
        for(Snake snake: snakes){
            if(snake.getStart() == newPosition){

                newPosition = snake.getEnd();
                System.out.println("Snake bit");
                return newPosition;
            }
        }
        for(Ladder  ladder: ladders){
            if (ladder.getStart() == newPosition){
                newPosition = ladder.getEnd();
                System.out.println("Climbed ladder");
                return newPosition;
            }
        }
        return newPosition;
    }

    public int getBoardSize(){
        return size;
    }
    public boolean isGameCompleted(int currentPosition){
        return currentPosition == size;
    }
}
