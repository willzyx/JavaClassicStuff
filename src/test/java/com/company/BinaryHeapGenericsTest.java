package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ows on 13.06.17.
 */
public class BinaryHeapGenericsTest {

    @Test
    public void testDefaultConstructor() {
        BinaryHeapGenerics<Integer> bh = new BinaryHeapGenerics<>();

        assertEquals("{[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]}", bh.toString());
    }

    @Test
    public void testSizeConstructor() {
        BinaryHeapGenerics<Integer> bh = new BinaryHeapGenerics<>(3);

        assertEquals("{[null, null, null]}", bh.toString());
    }

    @Test
    public void testAddNewNode() {
        BinaryHeapGenerics<Integer> bh = new BinaryHeapGenerics<>(3);

        bh.addNewNode(2);
        bh.addNewNode(1);
        assertEquals("{[2, 1, null]}", bh.toString());
    }

    @Test
    public void testGrowing() {
        BinaryHeapGenerics<Integer> bh = new BinaryHeapGenerics<>(3);

        bh.addNewNode(4);
        bh.addNewNode(3);
        bh.addNewNode(2);
        bh.addNewNode(1);

        assertEquals("{[4, 3, 2, 1, null, null]}", bh.toString());
    }

    @Test
    public void testGoUp() {
        BinaryHeapGenerics<Integer> bh = new BinaryHeapGenerics<>(3);

        bh.addNewNode(1);
        bh.addNewNode(2);
        bh.addNewNode(4);
        bh.addNewNode(3);

        assertEquals("{[4, 3, 2, 1, null, null]}", bh.toString());
    }


    @Test
    public void testGoDown() {
        BinaryHeapGenerics<Integer> bh = new BinaryHeapGenerics<>(3);

        bh.addNewNode(17);
        bh.addNewNode(13);
        bh.addNewNode(2);
        bh.addNewNode(30);
        bh.addNewNode(1);
        bh.addNewNode(11);
        bh.addNewNode(8);

        assertEquals(Integer.valueOf(30), bh.getTopNode());
        assertEquals(Integer.valueOf(17), bh.getTopNode());
        assertEquals(Integer.valueOf(13), bh.getTopNode());
        assertEquals(Integer.valueOf(11), bh.getTopNode());
        assertEquals(Integer.valueOf(8), bh.getTopNode());
        assertEquals(Integer.valueOf(2), bh.getTopNode());
        assertEquals(Integer.valueOf(1), bh.getTopNode());
    }


}
