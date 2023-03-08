package Threads;

import java.util.concurrent.Callable;

public class WaitingThread implements Callable<String> {
    String value;
    long waitingPeriodMillis;

    public WaitingThread(String value, long waitingPeriodMillis){
        this.value = value;
        this.waitingPeriodMillis = waitingPeriodMillis;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(waitingPeriodMillis);
        System.out.println("from the thread: "+value);
        return value;
    }
    /**
     * we could use Runnable or Callable when creating threads
     * runnable simply runs a thread, callable runs a thread that returns a value
     *
     * Run runnables/callables with the ExecutorService
     *
     * Threads are independent executions of code that can run concurrently and occupy the same heap
     * memory - that means that hypothetically multiple threads can operate on the same objects
     *
     * however, threads are inherently unpredictable - so, operating on the same thread will
     * result in inconsistent behavior called a 'race condition'
     *
     * we can solve race conditions by using some form of thread synchronization - particularly,  the
     * 'synchronized' keyword will only allow a single thread to enter a sensitive method at a time
     *
     * this results in all threads that are due to enter a syncrhonized method being 'blocked' - meaning,
     * it just waits for the method to reopen - it's possible to have two threads waiting for each other infinitely -
     * called a deadlock
     */
}