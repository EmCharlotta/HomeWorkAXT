package homeworklesson200320;

public class Student extends Human implements Learn {
private int knowledge = 0;
private String subject;

    public Student(String name, int age, int knowledge, String subject) {
        super(name, age);
        this.knowledge = knowledge;
        this.subject = subject;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void learn() {
        knowledge++;
    }
}
