package hw6;

public class Teacher extends Person {

    private double salary;

    private String subject;

    public Teacher(int age, String name, String gender, double salary, String subject) {
        super(age, name, gender);
        this.salary = salary;
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", salary='" + salary + '\'' +
                ", subject='" + subject + '\'';
    }
}
