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

        @Override
        public String toString() {
            return "{" + "'" + nodeData + '\'' + ',' + nodeID + '}';
        }

        public int getNodeID() {
            return nodeID;
        }

    }

    public BinaryHeap(int arraySize) {
        anArray = new Node[arraySize];
    }

    @Override
    public String toString() {
        return "{" + Arrays.toString(anArray) + "}";
    }

    public BinaryHeap() {
        this(DEFAULT_CAPACITY);
    }

    public void addNewNode(String nodeData, int nodeID) {
        if (size >= anArray.length) {
            growAnArrayUp();
        }

        anArray[size] = new Node(nodeData, nodeID);
        size++;

        goUp();


    }

    private void goUp() {

        int i = size - 1;
        int parent = getParent(i);
        while (i > 0 && anArray[i].getNodeID() > anArray[parent].getNodeID()) {
            swapNodes(i, parent);
            i = parent;
            parent = getParent(i);
        }

    }

    private void swapNodes(int i, int j) {
        Node t = anArray[i];
        anArray[i] = anArray[j];
        anArray[j] = t;
    }

    private int getParent(int i) {
        return (i - 1) / 2;
    }

    private void growAnArrayUp() {
        anArray = Arrays.copyOf(anArray, anArray.length * 2);
    }

}
