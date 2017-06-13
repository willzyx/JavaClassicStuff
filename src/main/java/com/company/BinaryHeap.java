package com.company;

import java.util.Arrays;

/**
 * an implementation of Binary Heap on Array
 * need to try rewrite with generics
 * <p>
 * Created by pss on 13.06.17.
 */
public class BinaryHeap {
    final static int DEFAULT_CAPACITY = 16;
    Node[] anArray;
    int size;

    private class Node {
        String nodeData;
        int nodeID;

        Node(String nodeData, int nodeID) {
            this.nodeData = nodeData;
            this.nodeID = nodeID;
        }

        public String toMinimalString() {
            return "{" + "'" + nodeData + '\'' + ',' + nodeID + '}';
        }

        public int getNodeID() {
            return nodeID;
        }
    }

    public BinaryHeap(int arraySize) {
        anArray = new Node[arraySize];
    }

    public BinaryHeap() {
        this(DEFAULT_CAPACITY);
    }

    public void add(Node n) {
        if (size >= anArray.length) {
            growAnArrayUp();
        }

        anArray[size] = n;
        size++;

        //goUp();


    }

    private void growAnArrayUp() {
        anArray = Arrays.copyOf(anArray, anArray.length * 2);
    }

}
