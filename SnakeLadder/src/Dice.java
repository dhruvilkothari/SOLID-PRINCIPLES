public class Dice {
    int totalDice;
    public Dice(int totalDice){
        this.totalDice = totalDice;
    }

    public int rollDice(){
        int sum = 0;
        for(int i=1;i<=totalDice;i++){
            int min = 1;
            int max = 6;
            sum+=(int) Math.floor(Math.random() * (max - min + 1) + min);
        }
        return sum;

    }
}
