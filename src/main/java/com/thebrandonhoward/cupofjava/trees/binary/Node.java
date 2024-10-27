package com.thebrandonhoward.cupofjava.trees.binary;

import lombok.Data;

@Data
public class Node<T> {
    private T data;
    private Node<T> leftChild;
    private Node<T> rightChild;

    public Node(T data) {
        this.data = data;
    }
}