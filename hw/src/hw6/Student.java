package hw6;

public class Student extends Person {

    private String id;

    private double gpa;

    public Student(int age, String name, String gender, double gpa, String id) {
        super(age, name, gender);
        this.gpa = gpa;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", id='" + id + '\'' +
                ", gpa='" + gpa + '\'';
    }
}
