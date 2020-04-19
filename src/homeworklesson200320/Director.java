package homeworklesson200320;

public class Director extends Human {
    public Director(String name, int age) {
        super(name, age);
    }
    public void startClasses(){
        System.out.println("Директор говорит: Занятия начинаются");
    }
    public void endClasses(){
        System.out.println("Директор говорит: Занятия заканчиваются");
    }
}
