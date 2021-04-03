package ja.aop.orderaspects;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* add*(..))")
    public void allAddMethods() {
    }

}
