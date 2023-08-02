package com.zipcodewilmington.singlylinkedlist;

        import java.util.Comparator;

public interface LinkedInterface <T> {

    public void add(T data);
    public void remove(int index) throws IndexOutOfBoundsException;
    public T get(int index) throws IndexOutOfBoundsException;
    public boolean contains(T data);
    public int find(T data);
    public int size();
    public SinglyLinkedList<T> copy();

    public void sort(Comparator<T> comparator);

}
