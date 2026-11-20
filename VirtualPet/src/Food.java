// Part B

public class Food {
    private String foodName;
    private int energyIncrease;
    private int happinessIncrease;
    private int weightGain;

    public Food(String foodName, int energyIncrease, int happinessIncrease, int weightGain){
        this.foodName = foodName;
        this.energyIncrease = energyIncrease;
        this.happinessIncrease = happinessIncrease;
        this.weightGain = weightGain;
    }

    public int getEnergyIncrease() {
        return energyIncrease;
    }

    public int getHappinessIncrease() {
        return happinessIncrease;
    }

    public int getWeightGain() {
        return weightGain;
    }

    public String getName() {
        return foodName;
    }
}
