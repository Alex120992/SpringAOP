package ja;
import ja.joinpoint.Book;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);
        Book book = context.getBean("book", Book.class);

        book.addBook("sdsad",100);
        context.close();

    }
}
