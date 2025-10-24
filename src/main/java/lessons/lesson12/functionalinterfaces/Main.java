package lessons.lesson12.functionalinterfaces;


import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
        Predicate<Integer> predicate = x->x%2==0;
        System.out.println(filter(numbers,predicate));

        List<String> strNumbers = List.of("1","3","y","7");
        Function<String, Integer> function = Integer::parseInt;
        System.out.println(map(strNumbers, function));

        List<String> example = List.of("Java", "Python", "C#", "PHP");
        Consumer<String> consumer = System.out::println;
        forEach(example, consumer);

        Supplier<Integer> supplier = ()->(int)(Math.random()*10);
        System.out.println(generate(supplier, 10));

    }

    //#1
    public void isNotEmptyAndLongerThanThree(){
        List<String> list = List.of("Go", "Tree", "Sun", "Lamp", "Clothes");
        Predicate<String> emptyPredicate = String::isEmpty;
        Predicate<String> lengthPredicate = str->str.length()>=3;
        list.stream().filter(emptyPredicate.and(lengthPredicate)).forEach(System.out::println);
    }
    //#2
    public void getLength(){
        List<String> list = List.of("Go", "Tree", "Sun", "Lamp", "Clothes");
        Function<String, Integer> lengthFunction = String::length;
        list.stream().map(lengthFunction).forEach(System.out::println);
    }
    //#3
    public void getUUID(){
        Supplier<String> uuidSupplier = () -> UUID.randomUUID().toString();
        System.out.println(uuidSupplier.get());
    }
    //#4
    public void getLineInUpperCase(){
        String line = "gfjdf hfhjd hfbgf";
        Consumer<String> upperConsumer =  consString -> {
            for(int i = 0; i < consString.length(); i++){
                System.out.println(String.valueOf(consString.charAt(i)).toUpperCase());
            }
        };
        upperConsumer.accept(line);
    }
    //#5
    public void getSumOfTwoNumbers(){
        BiFunction<Integer, Integer, Integer> sumOfTwoNumbers = Integer::sum;
        System.out.println(sumOfTwoNumbers.apply(2,3));
    }
    //#6
    public void trimAndUpperCase(){
        String names = "oliver emma liam sophia noah";
        Function<String, String> trim = String::trim;
        Function<String, String> toUpperCase = String::toUpperCase;
        Function<String, String> function = trim.andThen(toUpperCase);
        System.out.println(function.apply(names));
    }
    //#7
    public void printLineAndLength(){
        String strExample = "Fhbfjdfb";
        Consumer<String> printStr = System.out::println;
        Consumer<String> printLength = str->{
            System.out.println(" length = " + str.length());
        };
        Consumer<String> printStrAndLength = printStr.andThen(printLength);
        printStrAndLength.accept(strExample);
    }
    //#8
    public void isEvenAndPositive(){
        Predicate<Integer> isEven = num->num%2==0;
        Predicate<Integer> isPositive = num->num>=0;
        Predicate<Integer> isOddOrNegative = (isEven.negate()).or(isPositive.negate());
        int number = 2;
        System.out.println(isOddOrNegative.test(number));
    }
    //#9
    public void multiplyAndPrint(){
        BiFunction<Integer, Integer, Integer> multiply = (a,b)->a*b;
        Function<Integer, String> toStr = x->"Result " + x;
        BiFunction<Integer,Integer,String> function = multiply.andThen(toStr);
        System.out.println(function.apply(5,6));
    }
    //#10
    public void addExclamationMark(){
        UnaryOperator<String> addExclamation = str -> str + "!!!";
        String str = "Hello";
        System.out.println(addExclamation.apply(str));
    }
    //#11
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for(T value : list){
            if(predicate.test(value)){
                filteredList.add(value);
            }
        }
        return filteredList;
    }
    //#12
    public static <T,R> List<R> map(List<T> list, Function<T, R> mapper){
        List<R> integerList = new ArrayList<>();
        for(T str : list){
            try {
                integerList.add(mapper.apply(str));
            }catch (NumberFormatException e){
                integerList.add(null);
            }

        }
        return integerList;
    }
    //#13
    public static <T> void forEach(List<T> list, Consumer<T> consumer){
        List<T> consumedList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            consumer.accept(list.get(i));
        }
    }
    //#14
    public static <T> List<T> generate(Supplier<T> supplier, int n){
        List<T> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(supplier.get());
        }
        return list;
    }

}
