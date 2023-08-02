package com.zipcodewilmington.singlylinkedlist;

import java.util.Comparator;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> implements LinkedInterface {
public SinglyLinkedList(){

    }
    private Node<T> head =null;
    public Boolean isEmpty(){
    return head == null;
    }
    @Override
    public void add(Object data) {
    Node newNode= new Node(data);
    if(this.head == null){
        this.head =newNode;
    }
    else{
        Node<T> temp = head;
        while(temp.hasNext()){
            temp=temp.getNext();
        }
        temp.setNext(newNode);
    }
    }




    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        //ADD HEAD
        sb.append("Head -> ");
        //Loop through the list and print each data
        if(head  != null) {
            Node<T> temp = head;
            do { // walk to end
                //Print the data.....
                sb.append("[" + temp.getData() + "] -> ");
                temp = temp.getNext();
            } while (temp != null);  //&& temp.hasNext());
        }
        //ADD NULL
        sb.append("NULL");
        return sb.toString();
    }

    @Override
    public void remove(int index) throws IndexOutOfBoundsException {
        if(index>0) {
            head = (Node<T>) get(index - 1);
            head.setNext((Node) get(index + 1));
        }
        if (index ==0){

            head= (Node<T>) get(index + 1);
        }


    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        if(this.head==null)return null;
        if(index == 0 ){
            return this.head;
        }
        else{
            Node<T> p =head;
            for (int i=0;i<index;i++){
                p=p.getNext();
            }
            return p;
        }

    }

    @Override
    public boolean contains(Object data) {
        return (this.find(data)!= -1);
    }

    @Override
    public int find(Object data) {
        if(this.isEmpty())return -1;
        int found=-1;

        Node <T>temp =head;
        do {
            found++;
            if(temp.getData().equals((data))) return found;
            temp=temp.getNext();
        }while(temp != null);


        return -1;
    }

    @Override
    public int size() {
        if(this.isEmpty()) return 0;
        int count=0;
        Node <T>temp =head;
        do {
        count++;
        temp=temp.getNext();
        }while(temp != null);
        return count;
    }

    @Override
    public SinglyLinkedList copy() {
        SinglyLinkedList result = new SinglyLinkedList();
        if(this.isEmpty()){
            return result;
        }
        Node temp =head;
        while(temp.hasNext()){
            result.add(temp.getData());
            temp = temp.getNext();
        }
result.add(temp.getData());
        return result;
    }

    @Override
    public void sort(Comparator comparator) {

    }
}
