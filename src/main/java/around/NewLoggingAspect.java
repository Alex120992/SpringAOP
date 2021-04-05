package around.aop_students;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    /**
     * Around  - выполняется как до выполнения метода так и после
     */
@Around()
    
}
