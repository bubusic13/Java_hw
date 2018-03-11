import partfive.ChessHorse;
import partfour.SortByValue;
import partfour.TopPasswords;
import partone.Examinations;
import partone.Faculty;
import partone.Student;
import partone.Teacher;
import partthree.DifferentElements;
import parttwo.TryToGuess;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Demo {

    public static void main(String[] args) throws IOException {
       /* TryToGuess tryToGuess = new TryToGuess();
        tryToGuess.typeNK();
        tryToGuess.tryGuess();
        */

       /* DifferentElements differentElements = new DifferentElements();
        differentElements.findNumberOfDifferentElements();
        */

        /* ChessHorse chessHorse = new ChessHorse();
        chessHorse.typeXY();
        chessHorse.checkMove();
        */


        TopPasswords topPasswords = new TopPasswords();
        topPasswords.readPasswords();
        Map map = topPasswords.getMap();
        SortByValue sortByValue = new SortByValue();

        Map<String, Integer> sortedMap = sortByValue.sortByComparator(map, false);

        for (int i = 0; i < 10; i++) {
            ArrayList<Map.Entry<String, Integer>> entry = new ArrayList<>(sortedMap.entrySet());
            System.out.println("Password : " + entry.get(i).getKey() + " Value : "+ entry.get(i).getValue());
        }

        /*
        Student studentVova = new Student("Vova");
        studentVova.registrationFaculty(Faculty.ComputerScience);
        studentVova.addExam("Math");
        studentVova.addExam("Chemistry");
        studentVova.addExam("History");
        Teacher teacher = new Teacher();
        teacher.setGrade(studentVova);
        checkPassed(studentVova);
        */
    }

    public static void checkPassed(Student student){
        ArrayList<Examinations> arrayList = student.getExams();
        int sum = 0;
        for(Examinations examinations : arrayList){
            sum += examinations.getGrade();
        }
        double averageGrade = (double) sum / arrayList.size();
        if(averageGrade >= 4){
            System.out.println("Student "+ student.getName() + " pass with average grade " + averageGrade);
        }
        else {
            System.out.println("Student "+ student.getName() + " dont pass with average grade " + averageGrade);
        }
    }
}
