package com.company;

/**
 * Let remember Linked List
 *
 * Created by pss on 12.06.17.
 */
public class LinkedList {

    Node headNode;


    private class Node {

        String nodeData;
        int nodeID;

        Node nextNode;

        public Node(String nodeData, int nodeID) {
            this.nodeData = nodeData;
            this.nodeID = nodeID;
            this.nextNode = null;
        }
    }
}
