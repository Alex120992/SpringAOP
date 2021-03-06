package after_throwing;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("Aleksey", 4, 5);
        Student st2 = new Student("Michail", 2, 3);
        Student st3 = new Student("Elena", 3, 4);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Начало работы getStudents");
        System.out.println(students.get(3));
        System.out.println("Information about students: ");
        System.out.println(students);
        return students;
    }
}
