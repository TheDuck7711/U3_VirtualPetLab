// Part B

public class Game {
    private String gameName;
    int happinessIncrease;
    int weightDecrease;

    public Game(String gameName, int happinessIncrease, int weightDecrease){
        this.gameName = gameName;
        this.happinessIncrease = happinessIncrease;
        this.weightDecrease = weightDecrease;
    }

    public int getHappinessIncrease() {
        return happinessIncrease;
    }

    public int getWeightDecrease() {
        return weightDecrease;
    }

    public String getName() {
        return gameName;
    }

    public boolean isWinner(){
        if(Math.random()>=.5){
            return true;
        }
        return false;
    }
}
