package homeworklesson200320;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        School school1 = new School("гимназия 157");
        Student student1 = new Student("Алеша", 16, 12, "Русский");
        school1.addStudent(student1);
        Student student2 = new Student("Тамара", 32, 0, "Математика");
        school1.addStudent(student2);
        Teacher teacher1 = new Teacher("Антон Павлович", 64, "Математика");
        Teacher teacher2 = new Teacher("Антон Антонович", 63, "Английский");
        school1.addTeacher(teacher1);
        school1.addTeacher(teacher2);
        Director director1 = new Director("Иван Иванович", 57);
        school1.addDirector(director1);
        //school1.schoolDay();
        //System.out.println(student2.knowledge);

    }
}
