package test250320;

public class Farmer {
    private int resource = 5;

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public void collectRes (FarmAnimals farmAnimal1){
    resource +=farmAnimal1.getResPerCycle();
    }
    public void spend (){
        resource -= 2;
    }

    public void eat (FarmAnimals farmAnimal){
        if (farmAnimal instanceof CanBeEaten) {
            farmAnimal.setOnFarm(false);
        }

    }

}
