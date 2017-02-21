package com.learning.linkedlist;

/**
 * Created by vperiasamy on 1/5/17.
 */
class Node<T> {
    private T data;
    private Node next;

    public Node(T data) {
        this.setData(data);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
