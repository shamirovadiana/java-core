package lessons.lesson03;

public class Book {
    private String isbn;
    private String name;
    private String author;
    private int year;
    private String status = "В наличии";

    public Book(String name, String author, int year, String isbn){
        this.name = name;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }
    public void getBookInfo(){
        System.out.println(String.format("Название: %s | Автор: %s | Год издания: %s | Статус: %s | ISBN: %s",
                name, author, year, status, isbn));
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

