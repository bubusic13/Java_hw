package hw6;

public class CollegeStudent extends Student {

    private int year;

    private String major;

    public CollegeStudent(int age, String name, String gender, double gpa, String id, int year, String major) {
        super(age, name, gender, gpa, id);
        this.year = year;
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", year='" + year + '\'' +
                ", major='" + major + '\'';
    }
}
