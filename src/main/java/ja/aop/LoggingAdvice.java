package ja.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAdvice {
    @Before("ja.aop.orderaspects.MyPointcuts.allAddMethods()") // Advice - метод
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка получить книгу");
    }
}
