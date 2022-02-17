package com.devglan.ds;

public class LinkedListOperations {

    public void traverse(LinkedListNode node) {
        while (node.getNextNode() != null) {
            System.out.println(node.getData());
        }
    }

    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode();
        head.setData(1);
        head.setPreviousNode(null);

        LinkedListNode firstNode = new LinkedListNode();
        firstNode.setData(2);
        head.setNextNode(firstNode);
        firstNode.setPreviousNode(head);

    }
}
