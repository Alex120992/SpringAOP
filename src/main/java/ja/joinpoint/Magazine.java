package ja.joinpoint;

import ja.AbstractLibrary;
import org.springframework.stereotype.Component;

@Component("mag")
public class Magazine extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("Берем журнал");
        System.out.println("------------------------");
    }

    public void getMagazine1() {
        System.out.println("Берем журнал 1");
        System.out.println("------------------------");
    }

    public void getMagazine2() {
        System.out.println("Берем журнал 2");
        System.out.println("------------------------");
    }

    public void addMagazine() {
        System.out.println("Добавляем книгу");
        System.out.println("------------------------");
    }

    public void returnMagazine1() {
        System.out.println("Возвращаем журнал 1");
        System.out.println("------------------------");
    }

    public void returnMagazine2() {
        System.out.println("Возвращаем журнал 2");
        System.out.println("------------------------");
    }

}
