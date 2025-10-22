package lessons.lesson11.publishersubscriber;

import java.util.Scanner;
import java.util.concurrent.*;

public class Main{
    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(2);
        PublisherSubscriber pubSub = new PublisherSubscriber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите значения. Для выхода введите 'exit'");
        executor.submit(()->{
            while (true) {
                try {
                    pubSub.consume();
                } catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }

        });
        while(true){
            System.out.println("Введите значение: ");
            String value = scanner.nextLine();
            if(value.equalsIgnoreCase("exit")){
                System.out.println("Программа завершается...");
                break;
            }
            try {
                pubSub.produce(value);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }

        }
        executor.shutdown();
        scanner.close();
        System.exit(0);
    }
}

