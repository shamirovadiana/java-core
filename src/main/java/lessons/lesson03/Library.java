package lessons.lesson03;
import java.util.HashMap;
import java.util.Map;

public class Library {

    private final Map<String, Book> bookMap;
    private final Map<String,Integer> bookAmountMap;
    public Library(){
        bookMap = new HashMap<>();
        bookAmountMap = new HashMap<>();
    }

    public void getBooks(){
        for(String key: bookMap.keySet()){
            bookMap.get(key).getBookInfo();
            System.out.println("--------------------------------------------------------");
        }
    }
    public void addNewBook(String name, String author, int year, String isbn, Integer amount){
        Book book = new Book(name, author, year, isbn);
        bookMap.put(isbn, book);
        bookAmountMap.put(isbn, amount);
    }

    public void reserveBook(String isbn){
        String status = bookMap.get(isbn).getStatus();
        if(status.equalsIgnoreCase("В наличии")){
            status = "Зарезервирована";
            bookMap.get(isbn).setStatus(status);
            String author = bookMap.get(isbn).getAuthor();
            String name = bookMap.get(isbn).getName();
            System.out.println(String.format("Вы зарезервировали %s %s",author, name));
        } else {
            System.out.println("Книга уже зарезервирована");
        }
    }
}

