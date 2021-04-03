package ja.joinpoint;

import ja.AbstractLibrary;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book  {
    @Value("Достоевский")
    private String author;
    @Value("Преступление и наказание")
    private String book;
    @Value("1866")
    private int yearOfPublication;

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {


        return yearOfPublication;

    }

    public void getBook() {
        System.out.println(author);
        System.out.println("------------------------");
    }

    public void returnBook() {
        System.out.println("Берем книгу");
        System.out.println("------------------------");

    }
    public  void addBook (String name, int count){
        System.out.println(name+" "+count);
    }
}

