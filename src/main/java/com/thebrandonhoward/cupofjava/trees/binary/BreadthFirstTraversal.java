package com.thebrandonhoward.cupofjava.trees.binary;

import java.util.*;
import java.util.stream.Stream;

public class BreadthFirstTraversal {
    public static void main(String[] args) {
        Node<Integer> node = new Node<>(1);
        node.setLeftChild(new Node<>(2));
        node.setRightChild(new Node<>(3));

        node.getLeftChild().setLeftChild(new Node<>(4));
        node.getLeftChild().setRightChild(new Node<>(5));

        node.getRightChild().setLeftChild(new Node<>(6));
        node.getRightChild().setRightChild(new Node<>(7));

        Stream.generate(() -> bft(node))
                .limit(3)
                .forEach(System.out::println);

        Stream.generate(() -> bft2(node))
                .limit(3)
                .forEach(System.out::println);
    }

    public static boolean bft(Node<Integer> head) {
        if(head == null)
            return false;

        final List<Node<Integer>> queue = new ArrayList<>();
        queue.add(head);

        while(!queue.isEmpty()) {
            System.out.println(queue.getFirst().getData());

            if(Objects.nonNull(queue.getFirst().getLeftChild()))
                queue.add(queue.getFirst().getLeftChild());

            if(Objects.nonNull(queue.getFirst().getRightChild()))
                queue.add(queue.getFirst().getRightChild());

            queue.removeFirst();
        }

        return true;
    }

    public static boolean bft2(Node<Integer> head) {
        if(head == null)
            return false;

        final ArrayDeque<Node<Integer>> queue = new ArrayDeque<>();
        queue.add(head);

        while(!queue.isEmpty()) {
            System.out.println(queue.getFirst().getData());

            if(Objects.nonNull(queue.getFirst().getLeftChild()))
                queue.add(queue.getFirst().getLeftChild());

            if(Objects.nonNull(queue.getFirst().getRightChild()))
                queue.add(queue.getFirst().getRightChild());

            queue.removeFirst();
        }

        return true;
    }

}
