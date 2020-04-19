package homeworklesson160320.cat;

public class Main {
    public static void main(String[] args) {
    Cat kitty = new Cat(12, "трехцветная","Пушкин",13);
    kitty.setName("Кнопка");
        System.out.println(kitty);
        Cat enemy = new Cat("Мурзик", "рыжий", 3);
        System.out.println(enemy);
        enemy.fightCat(kitty);
        System.out.println(enemy.getHealth());
    }
}
