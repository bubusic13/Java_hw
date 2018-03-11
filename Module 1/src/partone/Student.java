package partone;

import java.util.ArrayList;

public class Student {


    private String name;
    private Faculty faculty;
    private ArrayList<Examinations> exam = new ArrayList<>();

    public Student (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void registrationFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public  void addExam(String examName){
        Examinations examinations = new Examinations(examName);
        exam.add(examinations);
    }

    public ArrayList<Examinations> getExams(){
        return exam;
    }
}
