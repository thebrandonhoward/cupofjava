package com.thebrandonhoward.cupofjava.async;

import org.springframework.core.task.support.ExecutorServiceAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class MoreAsyncExamples {
    public static void main(String... args) {
        List<String> aList = new ArrayList<>();
        aList.add("1");
        aList.add("2");
        aList.add("3");
        aList.add("4");

        ExecutorService executorService = Executors.newFixedThreadPool(Math.min(aList.size(), 5));

        try {
            List<CompletableFuture<String>> collect = aList.stream()
                    .map(obj -> CompletableFuture.supplyAsync(() -> new MoreAsyncExamples().doSomeGood(obj))
                            .exceptionally(e -> e.getMessage()))
                    .map(objectCompletableFuture -> objectCompletableFuture.thenApplyAsync(obj -> new MoreAsyncExamples().doSomeGood(obj))
                            .exceptionally((e -> e.getMessage() + "2")))
                    .collect(Collectors.toList());

            List<String> collect1 = collect.stream()
                    .map(CompletableFuture::join)
                    .collect(Collectors.toList());

            collect1.forEach(System.out::println);
        }
        finally {
            //executorService.shutdown();
        }
    }

    public String doSomeGood(String msg) {
        if(msg.equals("3") || msg.equals("java.lang.NullPointerException"))
            doSomeBad(msg);

        return msg;
    }

    public String doSomeBad(String msg) {
        msg = null;
        return msg.toString();
    }
}
