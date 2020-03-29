package test250320;

class FarmAnimals extends Animals implements Run, Heal {
    final private int initialHealth = (int) (Math.random() * 4);
    private int health = initialHealth;

    private int resPerCycle = 0;
    private boolean isOnFarm = true;

    public int getInitialHealth() {
        return initialHealth;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getResPerCycle() {
        return resPerCycle;
    }

    public void setResPerCycle(int resPerCycle) {
        this.resPerCycle = resPerCycle;
    }

    public boolean isOnFarm() {
        return isOnFarm;
    }

    public void setOnFarm(boolean onFarm) {
        isOnFarm = onFarm;
    }

    @Override
    public void run(WildAnimals wildAnimal) {
        if (getSpeed() < wildAnimal.getSpeed()) {
            setHealth(health - wildAnimal.getPower());
            if (health < 1) {
                setOnFarm(false);
            }
        }
    }

    @Override
    public void heal() {
        if (health<initialHealth){
            health++;
        }
    }
}

