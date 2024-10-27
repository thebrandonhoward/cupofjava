package com.thebrandonhoward.cupofjava.trees.binary;

import java.util.stream.Stream;

public class DepthFirstTraversal {
    public static void main(String[] args) {
        Node<Integer> node = new Node<>(1);
        node.setLeftChild(new Node<>(2));
        node.setRightChild(new Node<>(3));

        node.getLeftChild().setLeftChild(new Node<>(4));
        node.getLeftChild().setRightChild(new Node<>(5));

        node.getRightChild().setLeftChild(new Node<>(6));
        node.getRightChild().setRightChild(new Node<>(7));

        Stream.generate(() -> dft(node, "in"))
                .limit(3)
                .forEach(System.out::println);
    }

    private static boolean dft(Node<Integer> head, String order) {
        if(order.equals("in"))
            return in(head);

        return false;
    }

    private static boolean in(Node<Integer> head) {
        if(head == null)
            return false;

        System.out.println(head.getData());

        in(head.getLeftChild());
        in(head.getRightChild());

        return true;
    }
}
