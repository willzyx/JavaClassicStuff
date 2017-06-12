package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ows on 12.06.17.
 */
public class MainTests {

    @Test
    public void testAddNodeToTheHead(){
        LinkedList ll = new LinkedList();
        ll.addNodeToTheHead("First", 1);
        ll.addNodeToTheHead("Second", 2);
        ll.addNodeToTheHead("Threed", 3);
        ll.addNodeToTheHead("Forth", 4);

        assertEquals("{'Forth',4}{'Threed',3}{'Second',2}{'First',1}",ll.printAllNodesInOneSting());

    }

    @Test
    public void testAddNodeAfterOldOne(){
        LinkedList ll = new LinkedList();
        ll.addNodeToTheHead("First", 1);
        ll.addNodeToTheHead("Second", 2);
        ll.addNodeToTheHead("Threed", 3);
        ll.addNodeToTheHead("Forth", 4);

        ll.addNodeAfterNode("Second.1",100, 3);

        assertEquals("{'Forth',4}{'Threed',3}{'Second.1',100}{'Second',2}{'First',1}",ll.printAllNodesInOneSting());

    }

    @Test (expected = IllegalArgumentException.class)
    public void testAddNodeAfterOldOnePhantomNode(){
        LinkedList ll = new LinkedList();
        ll.addNodeToTheHead("First", 1);
        ll.addNodeToTheHead("Second", 2);
        ll.addNodeToTheHead("Threed", 3);
        ll.addNodeToTheHead("Forth", 4);

        ll.addNodeAfterNode("Second.1",100, -3);
    }


    @Test
    public void testAddNodeToTheEnd(){
        LinkedList ll = new LinkedList();
        ll.addNodeToTheEnd("First", 1);
        ll.addNodeToTheEnd("Second", 2);
        ll.addNodeToTheEnd("Threed", 3);
        ll.addNodeToTheEnd("Forth", 4);

        assertEquals("{'First',1}{'Second',2}{'Threed',3}{'Forth',4}",ll.printAllNodesInOneSting());

    }

    @Test
    public void testDeleteNodeFromTheEnd(){
        LinkedList ll = new LinkedList();
        ll.addNodeToTheEnd("First", 1);
        ll.addNodeToTheEnd("Second", 2);
        ll.addNodeToTheEnd("Threed", 3);
        ll.addNodeToTheEnd("Forth", 4);

        ll.deleteNodeFromTheEnd();

        assertEquals("{'First',1}{'Second',2}{'Threed',3}",ll.printAllNodesInOneSting());

    }

}
