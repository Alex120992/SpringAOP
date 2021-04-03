package ja;

import org.springframework.stereotype.Component;

@Component ("bookBean")
public class Book  extends AbstractLibrary{
    private String book ="mybook";

    public void getBook() {
        System.out.println(book);
    }

    public void returnBook (){
        System.out.println("Берем книгу");
    }
}

