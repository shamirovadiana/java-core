package lessons.lesson11.threadpool;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class SimpleThreadPool extends Thread{
    private final Queue<Runnable> workQueue = new ConcurrentLinkedDeque<>();
    private final Integer corePoolSize = 5;
    private final Integer maxPoolSize = 10;
    private final Integer minPoolSize = 1;
    private final Thread[] threads;
    private volatile boolean isRunning = true;
    public SimpleThreadPool(){
        threads = new Thread[maxPoolSize];
    }
    //todo написать логику работы с потоками
    //случаи переполнения(threadsCount >= maxPoolSize)
    //случаи уменьшения количества работающих потоков(threadsCount == minPoolSize)
    //понять где и как использовать флаг для проверки потока(работает или нет) и нужен ли он вообще
    public void submit(Runnable task){
        for(int i = 0; i < corePoolSize; i++){
            threads[i] = new Thread();
            threads[i].start();
            task.run();
            workQueue.add(task);
        }
    }
    public void shutdown(){
        for(int i = 0; i < corePoolSize; i ++){
            threads[i].interrupt();
        }
    }
    public boolean isFull(){return true;}

    public boolean isEmpty(){return true;}

}
