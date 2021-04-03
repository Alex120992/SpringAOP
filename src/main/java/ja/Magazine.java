package ja;

import ja.AbstractLibrary;
import org.springframework.stereotype.Component;

@Component
public class Magazine extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("Берем журнал");
    }

    public void getMagazine1() {
        System.out.println("Берем журнал 1");
    }

    public void getMagazine2() {
        System.out.println("Берем журнал 2");
    }

    public void addMagazine() {
        System.out.println("Добавляем книгу");
    }

    public void returnMagazine1() {
        System.out.println("Возвращаем журнал 1");
    }

    public void returnMagazine2() {
        System.out.println("Возвращаем журнал 2");
    }

}
