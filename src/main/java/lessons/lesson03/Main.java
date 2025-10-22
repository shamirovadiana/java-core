package lessons.lesson03;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Онидзука Эйкити", 22);
        person.introduce();
        Rectangle rectangle = new Rectangle(7,8);
        int perimeter = rectangle.calculatePerimeter();
        int square = rectangle.calculateSquare();
        System.out.println(String.format("Периметр треугольника: %s | Площадь треугольника: %s", perimeter, square));
        Car car = new Car("Япония", "Toyota Corolla", 1997);
        car.printCarInfo();
        BankSystem bankSystem = new BankSystem();
        bankSystem.addAccount("fio1", UUID.randomUUID().toString());
        bankSystem.addAccount("fio2", UUID.randomUUID().toString());
        bankSystem.deposit("fio1", 10000);
        bankSystem.getBalance("fio1");
        bankSystem.withdraw("fio1", 2000);
        bankSystem.transferMoneyBetweenAccounts("fio1", "fio2", 5000);
        bankSystem.getAccountInfo("fio2");
        Library library = new Library();
        library.addNewBook("Преступление и Наказание", "Ф.М.Достоевский", 1866, "1564782914780", 10);
        library.addNewBook("Сердце", "Нацумэ Сосэки", 1914, "6579024536129", 5);
        library.addNewBook("Грокаем алгоритмы", "Адитья Бхаргава", 2016, "8903456290102", 7);
        library.reserveBook("8903456290102");
        library.getBooks();



    }
}
