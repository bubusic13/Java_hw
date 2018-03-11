package partone;


import java.util.Scanner;

public class Teacher {

    Scanner scanner = new Scanner(System.in);

    public  void setGrade(Student student){

        for(Examinations examinations : student.getExams()){
            int grade = scanner.nextInt();
            examinations.setGrade(grade);
        }
    }

}
