package test250320;

abstract public class WildAnimals extends Animals {
    private int power = (int) Math.random()*4 + 2;
    private int wasBanished = 0;
    final private int maxBanished = 3;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWasBanished() {
        return wasBanished;
    }

    public void setWasBanished(int wasBanished) {
        this.wasBanished = wasBanished;
    }

    public int getMaxBanished() {
        return maxBanished;
    }

    public void Eat(FarmAnimals farmAnimals){

    }
}
