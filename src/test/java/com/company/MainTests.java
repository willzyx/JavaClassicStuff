package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

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
        LinkedList normalList = new LinkedList();
        normalList.addNodeToTheEnd("First", 1);
        normalList.addNodeToTheEnd("Second", 2);
        normalList.addNodeToTheEnd("Threed", 3);
        normalList.addNodeToTheEnd("Forth", 4);

        normalList.deleteNodeFromTheEnd();

        assertEquals("Regular list", "{'First',1}{'Second',2}{'Threed',3}",normalList.printAllNodesInOneSting());

        LinkedList emptyList = new LinkedList();
        emptyList.deleteNodeFromTheEnd();

        assertEquals("Empty List","", emptyList.printAllNodesInOneSting());

        LinkedList oneNodeList = new LinkedList();
        oneNodeList.addNodeToTheEnd("First", 1);
        oneNodeList.deleteNodeFromTheEnd();

        assertEquals("One Node List","", oneNodeList.printAllNodesInOneSting());

        LinkedList twoNodesList = new LinkedList();
        twoNodesList.addNodeToTheEnd("First", 1);
        twoNodesList.addNodeToTheEnd("Second", 2);
        twoNodesList.deleteNodeFromTheEnd();

        assertEquals("Two Nodes List","{'First',1}", twoNodesList.printAllNodesInOneSting());


    }

    public void testDeleteNodeFromTheHead(){
        LinkedList normalList = new LinkedList();
        normalList.addNodeToTheEnd("First", 1);
        normalList.addNodeToTheEnd("Second", 2);
        normalList.addNodeToTheEnd("Threed", 3);
        normalList.addNodeToTheEnd("Forth", 4);

        normalList.deleteNodeFromTheHead();

        assertEquals("Regular list", "{'Second',2}{'Threed',3}{'Forth',4}",normalList.printAllNodesInOneSting());

        LinkedList emptyList = new LinkedList();
        emptyList.deleteNodeFromTheHead();

        assertEquals("Empty List","", emptyList.printAllNodesInOneSting());

        LinkedList oneNodeList = new LinkedList();
        oneNodeList.addNodeToTheEnd("First", 1);
        oneNodeList.deleteNodeFromTheHead();

        assertEquals("One Node List","", oneNodeList.printAllNodesInOneSting());

        LinkedList twoNodesList = new LinkedList();
        twoNodesList.addNodeToTheEnd("First", 1);
        twoNodesList.addNodeToTheEnd("Second", 2);
        twoNodesList.deleteNodeFromTheHead();

        assertEquals("Two Nodes List","{'Second',2}", twoNodesList.printAllNodesInOneSting());
    }

}
