package lessons.lesson08;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {
    String name;
    String author;
    String isbn;

    @Override
    public String toString(){
        return "Название= " + name + " Автор= " + author + " ISBN= " + isbn;
    }
}
