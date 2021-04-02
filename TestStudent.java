package collection;
import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Yasaman", "mtz", 19));
        students.add(new Student("Ali", "Hasani", 15));
        students.add(new Student("zahra", "hty", 20));
        students.add(new Student("Reza", "Pooladi", 15.80));

        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getFamily() + " " + student.getAverage());
        }
    }
}
