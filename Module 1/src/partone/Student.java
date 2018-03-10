package partone;

public class Student {


    private String name;
    private Faculty faculty;
    private int[] exam;

    public Student(String name){
        this.name = name;
    }

    public void registry (Faculty faculty){
        this.faculty = faculty;
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
    public int[] getExam() {
        return exam;
    }

    public void setExam(int[] exam) {
        this.exam = exam;
    }





}
