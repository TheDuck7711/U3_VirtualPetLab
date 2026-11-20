// Part B

public class VirtualPetB {
    private String petName;
    private int energy;
    private int happiness;
    private int weight =5;
    private int ageYears;
    private int ageMonths;

    public VirtualPetB(String petName){
        this.petName = petName;
        int weight = 5;
    }


    public String toString(){
        return(petName + "'s information: \n" + "Energy: " + energy + "\n Happiness: " + happiness + " \n Weight: " + weight + "\n Age: " + ageYears + " years and " + ageMonths + " months");
    }

    public void feed(Food snack){
        energy+= snack.getEnergyIncrease();
        if(energy>10){
            energy=10;
        }
        if(energy<0){
            energy=0;
        }

        happiness +=snack.getHappinessIncrease();

        if(happiness>10){
            happiness = 10;
        }
        if(happiness<0){
            happiness = 0;
        }

        weight+= snack.getWeightGain();
    }
    public boolean play(Game gamer){
        weight = weight - gamer.getWeightDecrease();
        if(weight<5){
            weight = 0;
        }
        if( gamer.isWinner()){
            happiness = happiness + gamer.getHappinessIncrease();
        }
        else{
            happiness = happiness - gamer.getHappinessIncrease();
        }

        if(happiness<0){
            happiness = 0;
        }
        if(happiness>10){
            happiness = 10;
        }

        return gamer.isWinner();
    }
    public void updateStatus(){
        if(happiness>0){
            happiness--;
        }
        if(energy>0){
            energy--;
        }
        ageMonths++;
        if(ageMonths >=12){
            ageMonths = 0;
            ageYears++;
        }
    }

    public int getEnergyLevel(){
        return energy;
    }
    public int getHappinessLevel(){
        return happiness;
    }
    public String getName(){
        return petName;
    }


}
