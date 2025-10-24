package lessons.lesson12.streamapi;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Product {
    String name;
    String category;
    double price;
    @Override
    public String toString(){
        return "Name= " + name + " Category= " + category + " Price= " + price;
    }
}
