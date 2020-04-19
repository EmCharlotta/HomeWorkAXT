package homeworklesson160320.cat;

public class Cat {
    String name;
    private int weight;
    private int age;
    private String colour;
    String ownerAddress;
    int health;
    int power;

    public Cat(String name, String colour, int health) {
        setHealth(health);
        setName(name);
        setColour(colour);
    }
    public Cat (int health, String colour, String ownerAddress, int power){
        setColour(colour);
        setHealth(health);
        setOwnerAddress(ownerAddress);
        setPower(power);
    }
    public Cat (){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>3 && name!=null){
        this.name = name;}
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                ", ownerAddress='" + ownerAddress + '\'' +
                ", health=" + health +
                ", power=" + power +
                '}';
    }
    public void fightCat (Cat enemyCat){
        health -= enemyCat.getPower();
    }
}
