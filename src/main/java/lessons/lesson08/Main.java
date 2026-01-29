package lessons.lesson08;

import java.util.*;


public class Main {
    public static void main(String[] args){
        Library library = new Library();
        library.addBook("Book1", "Author1", "12345");
        library.addBook("Book2", "Author2", "67890");
        library.addBook("Book3", "Author3", "56789");
        library.getAllBooks();
    }
    public static void getSequenceNumber(){
        ArrayDeque<String> people = new ArrayDeque<>();
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        people.addFirst(name);
        Random random = new Random();
        Long sequenceNumber = random.nextLong(0, 100);
        System.out.printf("%s! Ваш порядковый номер %s", name, sequenceNumber);
        people.pollFirst();
    }
    public static void printDistinctNumbers(){
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] nums = line.split(" ");
        ArrayList<Integer> intNums = new ArrayList<>();
        try {
            int intNum;
            for (String num : nums) {
                intNum = Integer.parseInt(num);
                intNums.add(intNum);
            }

            List<Integer> distinctNums = intNums.stream().distinct().toList();
            for (Integer num : distinctNums) {
                System.out.println(num);
            }
        } catch (RuntimeException e) {
            System.out.println("Введённый символ не является числом!");
        }
    }


}
