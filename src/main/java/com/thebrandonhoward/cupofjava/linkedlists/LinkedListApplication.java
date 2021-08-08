package com.thebrandonhoward.cupofjava.linkedlists;

public class LinkedListApplication {
    public static void main(String... args) {
        LinkedList linkedList = new LinkedList.LinkedListBuilder().data(1).build();
        linkedList.print();
        linkedList.push(2);
        linkedList.print();
        linkedList.push(3);
        linkedList.print();
        linkedList.push(4);
        linkedList.print();
        linkedList.push(5);
        linkedList.print();
        System.out.printf("data:%s -> ", linkedList.pop());linkedList.print();
        System.out.printf("data:%s -> ", linkedList.pop());linkedList.print();
        System.out.printf("data:%s -> ", linkedList.pop());linkedList.print();
        System.out.printf("data:%s -> ", linkedList.pop());linkedList.print();
        System.out.printf("data:%s -> ", linkedList.pop());linkedList.print();
    }
}
