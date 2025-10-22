package lessons.lesson08;

import java.util.HashMap;
import java.util.Map;

public class Library {
        private final Map<String, Book> bookMap;
        public Library(){
            bookMap = new HashMap<>();
        }

        public void addBook(String name, String author, String isbn){
            Book book = new Book(name, author, isbn);
            bookMap.put(isbn, book);
        }

        public void getAllBooks(){
            for(String key : bookMap.keySet()){
                String bookInfo = bookMap.get(key).toString();
                System.out.println(bookInfo);
            }
        }
}
