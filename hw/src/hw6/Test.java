package hw6;



public class Test {

    public static void main(String[] args) {

        Person person = new Person(22,"Bob" ,"M" );
        Teacher teacher = new Teacher(23, "Mat", "M", 100.003, "Math");
        Student student = new Student(14, "Lois", "M", 5.3, "N0123");
        CollegeStudent collegeStudent = new CollegeStudent(18, "Joe", "F", 4.4, "N0122", 2016, "English");

        Person[] p = new Person[4];
        p[0] = person;
        p[1] = teacher;
        p[2] = student;
        p[3] = collegeStudent;


        for (Person person1 : p ){
            System.out.println(person1);
        }
    }
}
