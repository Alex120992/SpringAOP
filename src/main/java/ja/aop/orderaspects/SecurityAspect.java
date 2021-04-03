package ja.aop.orderaspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class SecurityAspect {
    @Before("ja.aop.orderaspects.MyPointcuts.allAddMethods()") // Advice
    public void beforeGetSecurityBookAdvice() {
        System.out.println("beforeGetSecurityAdvice: проверка прав доступа");
    }
}
