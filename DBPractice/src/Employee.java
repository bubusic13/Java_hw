import java.util.Date;

public class Employee {
    String name;
    String lastName;
    Date hireDate;

    public Employee(String name, String lastName, Date date){
        this.name = name;
        this.lastName = lastName;
        this.hireDate = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}
