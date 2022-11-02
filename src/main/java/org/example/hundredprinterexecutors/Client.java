package org.example.hundredprinterexecutors;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(20);
        // Print 1 to 100 each from separate thread
        for (int i = 1; i <= 100; ++i) {
            executorService.execute(new PrintNumber(i));
        }

        Thread.sleep(10000000);
		executorService.shutdown();
    }
}
