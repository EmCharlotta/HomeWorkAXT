package homeworklesson200320;

public class Teacher extends Human implements Teach{
    String subjectToTeach;

    public Teacher(String name, int age, String subjectToTeach) {
        super(name, age);
        this.subjectToTeach = subjectToTeach;
    }

    public String getSubjectToTeach() {
        return subjectToTeach;
    }

    public void setSubjectToTeach(String subjectToTeach) {
        this.subjectToTeach = subjectToTeach;
    }


    @Override
    public void teach(Learn student) {
            student.learn();
        }

    }
