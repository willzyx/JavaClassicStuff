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

        assertEquals(ll.printAllNodesInOneSting(),"{'Forth',4}{'Threed',3}{'Second',2}{'First',1}");

    }

    @Test
    public void testAddNodeAfterOldOne(){
        LinkedList ll = new LinkedList();
        ll.addNodeToTheHead("First", 1);
        ll.addNodeToTheHead("Second", 2);
        ll.addNodeToTheHead("Threed", 3);
        ll.addNodeToTheHead("Forth", 4);

        ll.addNodeAfterNode("Second.1",100, 2);

        assertEquals(ll.printAllNodesInOneSting(),"{'Forth',4}{'Threed',3}{'Second',2}{'Second.1',100}{'First',1}");

    }

}
