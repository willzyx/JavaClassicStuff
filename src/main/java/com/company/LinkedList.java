package com.company;

/**
 * Let remember Linked List
 * <p>
 * Created by pss on 12.06.17.
 */
public class LinkedList {

    private Node headNode;

    private class Node {
        String nodeData;
        int nodeID;

        Node nextNode;

        Node(String nodeData, int nodeID) {
            this.nodeData = nodeData;
            this.nodeID = nodeID;
            this.nextNode = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "nodeData='" + nodeData + '\'' +
                    ", nodeID=" + nodeID +
                    '}';
        }
    }

    public void addNodeToTheHead(String nodeData, int nodeID) {
        Node node = new Node(nodeData, nodeID);
        node.nextNode = headNode;
        headNode = node;
    }

    public void printAllNodes() {
        Node n = headNode;
        while (n != null) {
            System.out.print(n.toString()+" ");
            n = n.nextNode;
        }
    }
}
