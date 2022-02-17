package com.devglan.ds;

public class LinkedListNode {

    private int data;
    private LinkedListNode nextNode;
    private LinkedListNode previousNode;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkedListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(LinkedListNode nextNode) {
        this.nextNode = nextNode;
    }

    public LinkedListNode getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(LinkedListNode previousNode) {
        this.previousNode = previousNode;
    }
}
