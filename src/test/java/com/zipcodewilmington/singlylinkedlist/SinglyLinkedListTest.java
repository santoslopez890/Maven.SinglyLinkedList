package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
    public void testConstructor(){
        SinglyLinkedList<Integer> llist=new SinglyLinkedList<>();
        Assert.assertNotNull(llist);
    }
    @Test
    public void testIsEmpty(){
        SinglyLinkedList<Integer> llist=new SinglyLinkedList<Integer>();
        Assert. assertEquals( true, llist.isEmpty());
    }
    @Test
    public void testAdd1(){
        SinglyLinkedList<Integer> llist=new SinglyLinkedList<Integer>();
        llist.add(1);
        Assert. assertEquals( false, llist.isEmpty());
    }
    @Test
    public void testAdd2(){
        SinglyLinkedList<Integer> llist=new SinglyLinkedList<Integer>();
        llist.add(1);
        llist.add(2);
        Assert. assertEquals( false, llist.isEmpty());
    }
    @Test
    public void testToString(){
        SinglyLinkedList<Integer> llist=new SinglyLinkedList<Integer>();
      String expected = "Head -> NULL";
      Assert.assertEquals(expected,llist.toString());

    }
    @Test
    public void testToString2(){
        SinglyLinkedList<Integer> llist=new SinglyLinkedList<Integer>();
        llist.add(1);
        String expected = "Head -> [1] -> NULL";
        Assert.assertEquals(expected,llist.toString());

    }
    @Test
    public void testToString3(){
        SinglyLinkedList<Integer> llist=new SinglyLinkedList<Integer>();
        llist.add(1);
        llist.add(2);
        String expected = "Head -> [1] -> [2] -> NULL";
        Assert.assertEquals(expected,llist.toString());

    }


}
