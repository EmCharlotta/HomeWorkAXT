package test250320;

abstract public class Animals {
    private String name;
    private int weight = (int) (Math.random()*6+1);
    private int speed = (int) (Math.random()*4+2);;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
