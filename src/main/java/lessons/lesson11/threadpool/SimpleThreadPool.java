package lessons.lesson11.threadpool;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class SimpleThreadPool extends Thread{
    private final Queue<Runnable> workQueue = new ConcurrentLinkedDeque<>();
    private final Integer corePoolSize = 5;
    private final Integer maxPoolSize = 10;
    private final Integer minPoolSize = 2;
    private boolean isRunning = false;
    public void execute(){}
    public void shutdown(){}


}
