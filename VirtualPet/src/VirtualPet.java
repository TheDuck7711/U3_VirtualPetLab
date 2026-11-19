// Part A

public class VirtualPet {
    private String petName;
    private int energy;
    private int happiness;
    private int weight =5;
    private int ageYears;
    private int ageMonths;

    public VirtualPet(String petName){
        this.petName = petName;
        int weight = 5;
    }


    public String toString(){
        return(petName + "'s information: \n" + "Energy: " + energy + "\n Happiness: " + happiness + " \n Weight: " + weight + "\n Age: " + ageYears + " years and " + ageMonths + " months");
    }

    public void feed(){
        if(energy<10){
            energy++;
        }
        weight++;
    }
    public void play(){
        if(weight>5){
            weight--;
        }
        if(happiness<10){
            happiness++;
        }
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
