package org.example.mergesortmultithreaded;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> listToSort = List.of(
                3, 1, 2, 9, 6, 8, 4, 7
        );

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        List<Integer> sortedArray =
                executorService.submit(new ArraySorter(listToSort)).get();

        for (int i = 0; i < sortedArray.size(); ++i) {
            System.out.println(sortedArray.get(i));
        }



    }
}
