package ja.aop.orderaspects;

import ja.joinpoint.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(2)
public class LoggingAspect {

    /**
     * Пусть теперь надо чтобы поинткат подошел ко всем методам, кроме returnMagazine2
     */
    @Pointcut("execution(* ja.Magazine.*(..))")
    private void allMethodsFromMagazine() {
    }

    @Pointcut("execution(public void ja.Magazine.returnMagazine2())")
    private void returnMagazine2FromMagazine() {

    }

    @Pointcut("allMethodsFromMagazine() && !returnMagazine2FromMagazine()")
    private void allMethodsFromMagazineExceptReturnMagazine2() {

    }

    @Before("allMethodsFromMagazineExceptReturnMagazine2()")
    public void BeforeAllMethodsFromMagazineExceptReturnMagazine2() {
        System.out.println("BeforeAllMethodsFromMagazineExceptReturnMagazine2: Вызваны все, кроме returnMagazine2");
    }
//    _________________________________
//    /**
//     * Возвращаем комбинацию Pointcat ов
//     */
//    @Pointcut("execution(* ja.Magazine.get*() )")
//    private void allGetMethodsFromMagazine() {
//
//    }
//
//    @Pointcut("execution(* ja.Magazine.return*() )")
//    private void allReturnMethodsFromMagazine() {
//
//    }
//
//    @Pointcut("allGetMethodsFromMagazine() || allReturnMethodsFromMagazine() ")
//    private void allGetAndReturnMethodsFromMagazine() {
//    }
//
//    @Before("allGetMethodsFromMagazine()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: Log №1");
//    }
//
//    @Before("allReturnMethodsFromMagazine()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: Log №2");
//    }
//
//    @Before("allGetAndReturnMethodsFromMagazine()")
//    public void BeforeGetAndReturnMethodsFromMagazine() {
//        System.out.println("BeforeGetAndReturnMethodsFromMagazine: Log №3 ");
//    }

//_____________________________________________________________________________
//    @Pointcut("execution(public void getBook())")
//    /**
//     * данный метод необходим как ссылка на данные Advice
//     * c помощью данного способа мы можем получать
//     * доступ к данным Advice без дублирования execution*/
//    private void allGetMethods() {
//    }
//
//    @Before("allGetMethods()") // Advice
//    public void beforeGetSecurityBookAdvice() {
//        System.out.println("beforeGetSecurityAdvice: проверка прав доступа");
//    }

//    @Before("allGetMethods()") // Advice - метод
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получить книгу");
//    }

    /** Join point - можем получить сигнатур метода*/
    @Before("ja.aop.orderaspects.MyPointcuts.allAddMethods()") // Advice - метод
    public void beforeAddBookAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature= "+methodSignature);
        System.out.println("methodSignature= "+methodSignature.getMethod());
        System.out.println("methodSignature= "+methodSignature.getReturnType());
        System.out.println("methodSignature= "+methodSignature.getName());

        if (methodSignature.getName().equals("addBook")){
            Object [] arguments = joinPoint.getArgs();
            for (Object x: arguments){
                if(x instanceof Book){
                    Book myBook = (Book) x;
                    System.out.println("Какая- то книга");
                }
                else if (x instanceof String){
                    System.out.println("Тип String");
                }
            }
        }


        System.out.println("beforeGetBookAdvice: попытка добавиь  книгу");
    }

}
