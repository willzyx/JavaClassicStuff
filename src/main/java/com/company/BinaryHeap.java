package com.company;

/**
 * an implementation of Binary Heap on Array
 * need to try rewrite with generics
 *
 * Created by pss on 13.06.17.
 */
public class BinaryHeap {
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
    }


}
