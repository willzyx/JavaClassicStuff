package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ows on 13.06.17.
 */
public class BinaryHeapTest {

    @Test
    public void testDefaultConstructor(){
        BinaryHeap bh = new BinaryHeap();

        assertEquals("{[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]}",bh.toString());
    }
    @Test
    public void testSizeConstructor(){
        BinaryHeap bh = new BinaryHeap(3);

        assertEquals("{[null, null, null]}",bh.toString());
    }

    @Test
    public void testAddNewNode(){
        BinaryHeap bh = new BinaryHeap(3);

        bh.addNewNode("B",2);
        bh.addNewNode("A",1);
        assertEquals("{[{'B',2}, {'A',1}, null]}",bh.toString());
    }

    @Test
    public void testGrowing(){
        BinaryHeap bh = new BinaryHeap(3);

        bh.addNewNode("D",4);
        bh.addNewNode("C",3);
        bh.addNewNode("B",2);
        bh.addNewNode("A",1);

        assertEquals("{[{'D',4}, {'C',3}, {'B',2}, {'A',1}, null, null]}",bh.toString());
    }

    @Test
    public void testGoUp(){
        BinaryHeap bh = new BinaryHeap(3);

        bh.addNewNode("A",1);
        bh.addNewNode("B",2);
        bh.addNewNode("D",4);
        bh.addNewNode("C",3);

        assertEquals("{[{'D',4}, {'C',3}, {'B',2}, {'A',1}, null, null]}",bh.toString());
    }


}
