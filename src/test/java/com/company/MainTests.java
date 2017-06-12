package com.company;

import org.junit.Test;

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

        ll.printAllNodes();

    }

}
