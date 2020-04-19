package homeworklesson200320;

import java.util.Scanner;

public class School {
    private final String name;
    private Director director;
    private Student[] students = new Student[3];
    private Teacher[] teachers = new Teacher[2];

    public School(String name, Director director) {
        this.name = name;
        this.director = director;
    }

    public School(String name) {
        this.name = name;
    }


    public void addStudent(Student newStudent) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = newStudent;
                break;
            }
        }
    }

    public void addTeacher(Teacher newTeacher) {
        for (int i = 0; i < students.length; i++) {
            if (teachers[i] == null) {
                teachers[i] = newTeacher;
                break;// но можно и return в данном случае
            }
        }
    }

    public void addDirector(Director newDirector) {
        if (director == null) {
            director = newDirector;
        }
    }

  /*  public void schoolDay () {
        else {
            director.startClasses();
            for (int i = 0; i<students.length; i++){
                for (int j = 0; j < teachers.length; j++){
                    if (students[i]!=null && teachers[j]!=null &&
                            students[i].getSubject().equals(teachers[j].getSubjectToTeach())){
                        teachers[j].teach(students[i]);
                    }
                }
            }
          /*  for (Student studentT : students) {
                for (Teacher teacherR : teachers) {
                    if (teacherR.subjectToTeach.equals(studentT.subject)) {
                        teacherR.teach(studentT);
                        break;
                    }
                }
            }
            director.endClasses();
   */
}