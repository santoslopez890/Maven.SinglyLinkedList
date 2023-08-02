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
    //SIZEESSS
    @Test
    public void testSize0(){
        SinglyLinkedList<Integer> llist=new SinglyLinkedList<Integer>();
        Assert. assertEquals( 0, llist.size());
    }
    @Test
    public void testSize2(){
        SinglyLinkedList<Integer> llist=new SinglyLinkedList<Integer>();
        llist.add(1);
        llist.add(2);
        Assert. assertEquals( 2, llist.size());
    }
    @Test
    public void testFind(){
        SinglyLinkedList<Integer> llist=new SinglyLinkedList<>();
        Assert.assertEquals(-1,llist.find(1));
    }
    @Test
    public void testFind1(){
        SinglyLinkedList<Integer> llist=new SinglyLinkedList<>();
        llist.add(1);
        Assert.assertEquals(0,llist.find(1));
    }
    @Test
    public void testFind1a(){
        SinglyLinkedList<Integer> llist=new SinglyLinkedList<>();
        llist.add(3);
        Assert.assertEquals(-1,llist.find(5));
    }
    @Test
    public void testFind3(){
        SinglyLinkedList<Integer> llist=new SinglyLinkedList<>();
        llist.add(1);//0
        llist.add(5);//1
        llist.add(9);//2
        Assert.assertEquals(0,llist.find(1));
        Assert.assertEquals(1,llist.find(5));
        Assert.assertEquals(2,llist.find(9));

    }

    @Test
    public void testContains0(){
        SinglyLinkedList<Integer> llist=new SinglyLinkedList<>();
        llist.add(5);///0
        Assert.assertEquals(true,llist.contains(5));
    }
    @Test
    public void testContains1(){
        SinglyLinkedList<Integer> llist=new SinglyLinkedList<>();
        llist.add(1);///0
        Assert.assertEquals(false,llist.contains(5));
    }

    @Test
    public void testGet0(){
        SinglyLinkedList<Integer> llist=new SinglyLinkedList<>();

        llist.add(1);
        llist.add(2);
        llist.add(3);
        llist.add(4);

        Assert.assertTrue(llist.get(3) instanceof Node);
    }
    @Test
    public void testGet3(){
        SinglyLinkedList<Integer> llist=new SinglyLinkedList<>();

        llist.add(1);
        llist.add(2);
        llist.add(3);
        llist.add(4);

        Node actual= (Node) llist.get(0);
        Node expected= (Node) llist.get(0);
        //Assert.assertTrue(llist.get(0) instanceof Node);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testRemoveNode(){
        //Given
        SinglyLinkedList<Integer> llist=new SinglyLinkedList<>();

        llist.add(1);
        llist.add(2);
        llist.add(3);
        llist.add(4);
        llist.add(5);
        //When
        llist.remove(2);


        //Assert.assertTrue(llist.get(0) instanceof Node);
        Assert.assertEquals(false,llist.contains(3));
    }
    @Test
    public void testRemoveNode2(){
        //Given
        SinglyLinkedList<Integer> llist=new SinglyLinkedList<>();

        llist.add(2);
        llist.add(3);
        llist.add(4);
        llist.add(5);
        //When

        llist.remove(1);
        llist.remove(1);
        llist.remove(1);



        //Assert.assertTrue(llist.get(0) instanceof Node);
        Assert.assertEquals(false,llist.contains(3));
        Assert.assertEquals(true,llist.contains(2));
        Assert.assertEquals(false,llist.contains(4));
        Assert.assertEquals(false,llist.contains(5));
        System.out.println(llist.toString());

    }
    @Test
    public void testRemoveNode3(){
        //Given
        SinglyLinkedList<Integer> llist=new SinglyLinkedList<>();
        llist.add(4);
        llist.add(5);
        //When
        llist.remove(0);
        //Assert.assertTrue(llist.get(0) instanceof Node);
        Assert.assertEquals(false,llist.contains(4));
        Assert.assertEquals(true,llist.contains(5));
        System.out.println(llist.toString());

    }
    @Test
    public void testRemoveNode4(){
        //Given
        SinglyLinkedList<Integer> llist=new SinglyLinkedList<>();
        llist.add(4);
        llist.add(5);
        llist.add(6);
        llist.add(7);
        //When
        llist.remove(3);
        //Assert.assertTrue(llist.get(0) instanceof Node);
        Assert.assertEquals(false,llist.contains(3));
        System.out.println(llist.toString());

    }
    @Test
    public void copyTest(){
        SinglyLinkedList<Integer> expected=new SinglyLinkedList<>();
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);

        SinglyLinkedList<Integer> actual =expected.copy();

        Assert.assertEquals(expected.toString(),actual.toString());
    }


}
