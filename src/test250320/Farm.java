package test250320;

public class Farm {
    private FarmAnimals[] farmAnimals = new FarmAnimals[10];
    private WildAnimals[] wildAnimals = new WildAnimals[10];
    Farmer farmer;

    public FarmAnimals[] getFarmAnimals() {
        return farmAnimals;
    }

    public void setFarmAnimals(FarmAnimals[] farmAnimals) {
        this.farmAnimals = farmAnimals;
    }

    public WildAnimals[] getWildAnimals() {
        return wildAnimals;
    }

    public void setWildAnimals(WildAnimals[] wildAnimals) {
        this.wildAnimals = wildAnimals;
    }

    public void collRes() {
        for (FarmAnimals farmAnimal : farmAnimals) {
            if (farmAnimal != null && farmAnimal instanceof GiveResources) {

            }
        }
    }

    public void farming() {
        farmer.spend();
        if (farmer.getResource() < 1) {
            System.out.println("Игра закончилась, фермер проиграл");
        }
        else
    }
}
