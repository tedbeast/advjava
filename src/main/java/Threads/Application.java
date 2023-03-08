package Threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Application {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        WaitingThread thread1 = new WaitingThread("I'm thread 1", 500);
        WaitingThread thread2 = new WaitingThread("I'm thread 2", 500);
//      run 2 tasks asynchronously
        Future<String> thread1result=executorService.submit(thread1);
        Future<String> thread2result = executorService.submit(thread2);

//      back to running synchronously
//        the 'get' method will pause, or 'block', this main method's execution until the callable returns
        System.out.println("thread 1 result:" +thread1result.get());
//
        System.out.println("thread 2 result:" +thread2result.get());
    }
}
