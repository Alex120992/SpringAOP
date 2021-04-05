package afterreturningadvice.aop_students;

import afterreturningadvice.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение " +
                "списка студентов перед getStudents");
        System.out.println("--------------------------------");
    }
/** Выводим после успешного выозова метода*/
//    @AfterReturning("execution(* getStudents())")
//    public void afterReturningGetStudentsLoggingAdvice() {
//        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение " +
//                "списка студентов после успешной работы getStudents");
//        System.out.println("--------------------------------");
//    }

    /**
     * Возвращаем обновленное значение в Main, в List<Student>students
     * @param studentss - имеет такое же имя как и returning = "studentss"
     */
    @AfterReturning(pointcut = "execution(* getStudents())", returning = "studentss")
    public void afterReturningGetStudentsLoggingAdvice(JoinPoint joinPoint, List<Student> studentss) {
        Student firstStudent = studentss.get(0);
        String name = firstStudent.getName();
        name = "Mr. "+name;
        firstStudent.setName(name);

        int avrGrade = firstStudent.getAvgGrade()+1;
        firstStudent.setAvgGrade(avrGrade);

        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение " +
                "списка студентов после успешной работы getStudents");
        System.out.println("--------------------------------");
    }
}
