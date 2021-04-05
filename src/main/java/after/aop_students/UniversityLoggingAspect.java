package after_throwing.aop_students;

import after_throwing.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    /**
     * @param exception - логиурем выброс исключения
     *можно получить доступ к исключения то что выбросилось из target method
     */
    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingGetStudentsLoggingAdvice: логгируем выброс исключения " +
                ""+ exception);
    }
//    @AfterThrowing("execution(* getStudents())")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: логгируем выброс исключения " +
//                ""+ exception);
//    }
}
