import partfive.ChessHorse;
import partone.Examinations;
import partone.Faculty;
import partone.Student;
import partone.Teacher;
import partthree.DifferentElements;
import parttwo.TryToGuess;

public class Demo {

    public static void main(String[] args) {
       /* TryToGuess tryToGuess = new TryToGuess();
        tryToGuess.typeNK();
        tryToGuess.tryGuess();
        */

       /* DifferentElements differentElements = new DifferentElements();
        differentElements.findNumberOfDifferentElements();
        */

        /* Student student = new Student("Vova");
        student.registry(Faculty.ComputerScience);
        Examinations examinations = new Examinations();
        int[] array = {0,0,0,0,0};
        student.setExam(array);

        examinations.setExam(student.getName(), student.getExam());
        Teacher teacher = new Teacher();
        int[] grade = {3,4,5,4,5};
        teacher.grade(student.getName(), examinations, grade);
        checkPass(examinations.getMap().get(student.getName()));

    }

    public static void checkPass(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
         if(sum / arr.length > 4){
            System.out.println("Pass");
         }
         else {
            System.out.println("Dont pass");
         } */

        ChessHorse chessHorse = new ChessHorse();
        chessHorse.typeXY();
        chessHorse.checkMove();

    }
}
