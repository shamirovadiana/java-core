package lessons.lesson11.publishersubscriber;

import lombok.NoArgsConstructor;
import java.util.LinkedList;
import java.util.Queue;

@NoArgsConstructor
public class PublisherSubscriber {
    private final Queue<String> list  = new LinkedList<>();
    private final Integer maxQueueSize = 5;

    public synchronized void produce(String value) throws InterruptedException{
        if(list.size() == maxQueueSize){
            wait();
        }
        list.add(value);
        System.out.println("Значение добавлено в очередь: " + value);
        notifyAll();
    }
    public synchronized void consume() throws InterruptedException{
        if(list.isEmpty()){
            wait();
        }
        String value = list.poll();
        System.out.println("Значение извлечено из очереди: " + value);
        notifyAll();
    }
}
