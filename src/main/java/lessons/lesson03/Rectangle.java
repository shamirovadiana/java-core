package lessons.lesson03;
public class Rectangle {
    private int length;
    private int width;
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public Rectangle(){}
    public int calculateSquare(){
        return length * width;
    }
    public int calculatePerimeter(){
        return 2 * (length + width);
    }
    public int getLength(){
        return length;
    }
    public void setLength(int length){
        if(length > 0){
            this.length = length;
        }
        else {
            System.out.println("Длина прямоугольника не может быть не положительной!");
        }
    }
    public int getWidth(){
        return width;
    }
    public void setWidth(int width){
        if(width > 0){
            this.width = width;
        }
        else {
            System.out.println("Ширина прямоугольника не может быть не положительной!");
        }
    }
}

