package com.thebrandonhoward.cupofjava.linkedlists;

import lombok.Getter;
import lombok.ToString;
import sun.awt.image.ImageWatched;

import java.util.stream.Stream;

public class LinkedList<T extends Comparable<T>> implements Cloneable {
    private Node<T> root;

    private LinkedList(T data) {
        this.root = new Node.Builder().data(data).next(null).build();
    }

    private LinkedList(T data, Node<T> next) {
        this.root = new Node.Builder().data(data).next(next).build();
    }

    public Node<T> push(T data) {
        this.root = new Node.Builder().data(data).next(this.root).build();
        return this.root;
    }

    public T pop() {
        T data = this.root.getData();

        this.root = this.root.getNext();

        return data;
    }

    public void print() {
        Stream.of(root).forEach(System.out::println);
    }

    public static class LinkedListBuilder<T extends Comparable<T>> {
        private T data;
        private Node<T> next;

        public LinkedListBuilder data(T data) {
            this.data = data;
            return this;
        }

        public LinkedListBuilder next(Node<T> next) {
            this.next = next;
            return this;
        }

        public LinkedList build() {
            return new LinkedList(this.data, this.next);
        }
    }
}

@ToString
@Getter
class Node<T extends  Comparable<T>> {
    private final T data;
    private final Node<T> next;

    private Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    static class Builder <T extends Comparable<T>> {
        private T data;
        private Node<T> next;

        Builder data(T data) {
            this.data = data;
            return this;
        }

        Builder next(Node<T> next) {
            this.next = next;
            return this;
        }

        Node<T> build() {
            return new Node(this.data, this.next);
        }
    }

}
