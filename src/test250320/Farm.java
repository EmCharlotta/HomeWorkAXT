package test250320;

import java.util.Random;

public class Farm {
    Wolf wolf1 = new Wolf();
    Fox fox1 = new Fox();
    Bear bear1 = new Bear();
    Random random1 = new Random();
    private WildAnimals [] wildAnimals = {wolf1, fox1, bear1};
    Cow cow1 = new Cow();
    Cow cow2 = new Cow();
    Cow cow3 = new Cow();
    Cat cat1 = new Cat();
    Cat cat2 = new Cat();
    Hen hen1 = new Hen();
    Hen hen2 = new Hen();
    Rabbit rabbit1 = new Rabbit();
    Rabbit rabbit2 = new Rabbit();
    Rabbit rabbit3 = new Rabbit();
    private FarmAnimals[] farmAnimals = {cow1, cat1, hen1,rabbit1,cow2, cat2, hen2,rabbit2,cow3,rabbit3};

    Farmer farmer = new Farmer();

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

    public void farming() {
        farmer.spend();
        if (farmer.getResource() < 1) {
            System.out.println("Игра закончилась, фермер проиграл");
        } else {
            WildAnimals enemy = wildAnimals[(int) (Math.random() * wildAnimals.length)];
            FarmAnimals theAnimal = farmAnimals[(int) (Math.random() * farmAnimals.length)];
            if (random1.nextBoolean() != true) {
                theAnimal.run(enemy);
            } else {
                enemy.setWasBanished(enemy.getWasBanished() + 1);
                if (enemy.getWasBanished() >= enemy.getMaxBanished()) {
                    enemy = null;
                }
            }
            for (FarmAnimals farmAnimal1 : farmAnimals) {
                if (farmAnimal1.isOnFarm() != false) {
                    farmAnimal1.heal();
                }
            }
            int sum = 0;
            for (FarmAnimals farmAnimal1 : farmAnimals) {
                if (farmAnimal1.isOnFarm()==true && farmAnimal1 instanceof GiveResources) {
                    sum++;
                    farmer.collectRes();
                }
                if (sum<1) {
                }
                }
            }

        }
    }
}
