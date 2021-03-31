package com.thebrandonhoward.cupofjava.async;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureExamples {
    //Friend:callFriends
    //Friend:orderFood
    //Friend:orderDrink
    //Friend:startParty

    public static void main(String... args) throws Exception {
        System.out.printf("%d Available processors. %n", Runtime.getRuntime().availableProcessors());

        List<String> names = Arrays.asList("Brandon","Briden","Pam","Marilyn","Fred","Daisia");

        //Executor executor = Executors.newFixedThreadPool(64);

        long startMillis = System.currentTimeMillis();
//        callSync(names);
//        System.out.printf("All completed in %d milliseconds \n", System.currentTimeMillis()-startMillis);
//
//        System.out.println("--------------------------------------------------------------------------");
//
//        startMillis = System.currentTimeMillis();
        callAsync(names);
        System.out.printf("All completed in %d milliseconds \n", System.currentTimeMillis()-startMillis);

    }

    private static void callSync(List<String> friends) {
        List<Order> orderList = new ArrayList<>();

        friends.stream().forEach(friend -> {
            try {
                Order order = callFriend(friend);
                Order order1 = orderFood(order);
                Order order2 = orderDrink(order1);
                Order order3 = hasArrived(order2);

                orderList.add(order3);
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        });

        orderList.stream().forEach(System.out::println);
    }

    private static void callAsync(List<String> friends) {
        ExecutorService executor
                = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * Runtime.getRuntime().availableProcessors());

        List<CompletableFuture<Order>> collect = friends.stream()
                .filter(name -> name != null)
                .map(name -> CompletableFuture.supplyAsync(() -> {
                    Order order = null;
                    try {
                        order = callFriend(name);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return order;
                }, executor))
                .map(order -> order.thenApply(order1 -> {
                    try {
                        return orderFood(order1);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return null;
                }))
                .map(order -> order.thenApply(order1 -> {
                    try {
                        return orderDrink(order1);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return null;
                }))
                .map(order -> order.thenApply(order1 -> {
                    try {
                        return hasArrived(order1);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return null;
                }))
                .collect(Collectors.toList());

        List<Order> collect1 = collect.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

        collect1.stream().forEach(System.out::println);

        executor.shutdown();

    }
    private static Order callFriend(String name) throws Exception {
        int id = new Random().nextInt(20);

        Thread.sleep(id * 1000);

        System.out.printf("Called %s at %s \n", name, new Date(System.currentTimeMillis()));

        return Order.fromIdAndName(id, name);
    }

    private static Order orderFood(Order order) throws Exception {
        Thread.sleep(order.getId() * 1000);

        order.setFood( (order.getId() > 10) ? "fish" : "shrimp" );

        System.out.printf("Ordered %s for %s at %s \n", order.getFood(), order.getFriend(), new Date(System.currentTimeMillis()));

        return order;
    }

    private static Order orderDrink(Order order) throws Exception {
        Thread.sleep(order.getId() * 1000);

        order.setDrink( (order.getId() > 10) ? "water" : "cola" );

        System.out.printf("Ordered %s for %s at %s \n", order.getDrink(), order.getFriend(), new Date(System.currentTimeMillis()));

        return order;
    }

    private static Order hasArrived(Order order) throws Exception {
        Thread.sleep(order.getId() * 1000);

        order.setPresent(true);

        System.out.printf("%s arrived at %s \n", order.getFriend(), new Date(System.currentTimeMillis()));

        return order;
    }
}

class Order {
    private Order () {
    }

    public static Order fromIdAndName(int id, String name){
        Order order = new Order();
        order.setId(id);
        order.setFriend(name);
        return order;
    }

    private int id;
    private String friend;
    private String food;
    private String drink;
    private boolean present;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFriend() {
        return friend;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", friend='" + friend + '\'' +
                ", food='" + food + '\'' +
                ", drink='" + drink + '\'' +
                ", present=" + present +
                '}';
    }
}
