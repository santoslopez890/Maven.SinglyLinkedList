package com.zipcodewilmington.singlylinkedlist;

public class Node<T> {

    private T data;
    private Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
    public Node(T data) {
        this(data,null);
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node newNode) {
        this.next=newNode;
    }

    public boolean hasNext() {
        return this.next != null;
    }
    //public T getNext() { return (T) next;}

}

