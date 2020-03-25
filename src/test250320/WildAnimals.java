package test250320;

abstract public class WildAnimals extends Animals {
    private int power;
    private int wasBanished = 0;
    final private int maxBanished = 3;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void Eat(FarmAnimals farmAnimals){

    }
}
