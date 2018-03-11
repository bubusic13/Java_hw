package partone;



public class Examinations {

    private int grade = 0;
    private String nameOfExam;

    public Examinations(String nameOfExam){
        this.nameOfExam = nameOfExam;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getNameOfExam() {
        return nameOfExam;
    }

    public void setNameOfExam(String nameOfExam) {
        this.nameOfExam = nameOfExam;
    }
}
