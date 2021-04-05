package afterreturningadvice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Conf.class);

        University university = context.getBean("university", University.class);
        university.addStudents();
        List<Student>students = university.getStudents();
        System.out.println(students);

        context.close();
    }
}
