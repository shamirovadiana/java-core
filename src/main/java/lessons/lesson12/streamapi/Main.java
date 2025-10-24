package lessons.lesson12.streamapi;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args){
        //#1
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        for(int number: numbers){
            if(number%2 == 0){
                System.out.println(number*number);
            }
        }

        IntStream intStream = numbers.stream().filter(x -> x % 2 == 0).mapToInt(x -> x * x);
        intStream.forEach(System.out::println);

        //#2
        List<String> words = List.of("apple", "banana", "pear", "pineapple");
        for(String word: words){
            if(word.length() > 5){
                System.out.println(word);
            }
        }

        Stream<String> wordsStream = words.stream();
        wordsStream.filter(x->x.length() > 5).forEach(System.out::println);

        //#3
        List<Integer> nums = List.of(10, 2, 33, 4, 25);
        //минимальное значение
        int min = nums.get(0);
        for (int i = 1; i < nums.size(); i++){
            if(nums.get(i) < min){
                min = nums.get(i);
            }
        }
        System.out.println("Минимальное значение= " + min);

        Optional<Integer> streamMin = nums.stream().min(Integer::compare);
        System.out.println(streamMin);

        //максимальное значение
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++){
            if(nums.get(i) > max){
                max = nums.get(i);
            }
        }
        System.out.println("Максимальное значение= " + max);

        Optional<Integer> streamMax = nums.stream().max(Integer::compare);
        System.out.println(streamMax);

        //#4
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");
        double averageLength = 0;
        for(String name: names){
            averageLength += name.length();
        }
        averageLength /= names.size();
        System.out.println("Средняя длина строки в списке : " + averageLength);

        IntStream namesStream = names.stream().mapToInt(String::length);
        OptionalDouble streamAverageLength = namesStream.average();
        System.out.println(streamAverageLength);

        //#5
        List<String> input = List.of("apple", "pear", "apple", "banana", "pear");
        HashSet<String> inputSet = new HashSet<>(input);
        List<String> sortedList = new ArrayList<>(inputSet);
        sortedList.sort((x,y) -> x.length()-y.length());
        for(String word : sortedList){
            System.out.println(word);
        }

        Stream<String> streamInput = input.stream().distinct().sorted((x,y) -> x.length()-y.length());
        streamInput.forEach(System.out::println);

        //#6
        List<String> fruits = List.of("apple", "banana", "kiwi");
        Map<String, Integer> fruitsMap = new HashMap<>();
        for(String fruit: fruits){
            fruitsMap.put(fruit, fruit.length());
        }
        System.out.println(fruitsMap);

        Map<String, Integer> fruitsStreamMap = fruits.stream().collect(Collectors.toMap(x->x, String::length));
        System.out.println(fruitsStreamMap);

        //#7
        List<String> names1 = List.of("Alice", "Andrew", "Bob", "Charlie", "Catherine");
        Map<Character, List<String>> names1Map = new HashMap<>();
        for(String name: names1){
            Character key = name.charAt(0);
            List<String> namesList = names1Map.computeIfAbsent(key, k -> new ArrayList<>());
            namesList.add(name);
        }
        names1Map.forEach((k,v)-> System.out.println(k + " = " + v));

        Map<Character, List<String>> streamNamesMap = names1.stream().collect(Collectors.groupingBy(s->s.charAt(0),Collectors.toList()));
        streamNamesMap.forEach((k,v)-> System.out.println(k + " = " + v));

        //#8
        List<String> names2 = List.of("Tom", "Jerry", "Spike");
        String joinedNames = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < names2.size() - 1; i++){

            sb.append(names2.get(i)).append(", ");
        }
        sb.append(names2.get(names2.size() - 1));
        joinedNames = sb.toString();

        System.out.println(joinedNames);

        String streamedJoinedNames = names2.stream().collect(Collectors.joining(", "));
        System.out.println(streamedJoinedNames);

        System.out.println(String.join(", ", names2));

        //#9
        List<String> sentences = List.of("Java is cool", "Streams are powerful");
        String[] sentence = String.join(" ", sentences).split(" ");
        for(String word : sentence){
            System.out.println(word);
        }
        List<String> sentenceStream = sentences.stream().flatMap(x->Arrays.stream(x.trim().split(" "))).collect(Collectors.toList());
        sentenceStream.forEach(System.out::println);

        //10
        List<Product> products = List.of(
                new Product("Phone", "Electronics", 1200),
                new Product("TV", "Electronics", 1800),
                new Product("Apple", "Fruits", 2.5),
                new Product("Mango", "Fruits", 4.0)
        );

        List<Product> productsStream = products.stream().sorted(Comparator.comparingDouble(Product::getPrice)).toList();
        productsStream.forEach(System.out::println);



    }
}
