package org.example.homework_2024_02_20.linkedlist_previous_homework;

public class Node {

    private int item;// для хранения данных
    private Node nextNode;// для хранения ссылки на следующий объект хранения

    public Node(int item) {

        this.item = item;
        this.nextNode = null;
    }
    public Node() {
    }
    public int getItem() {
        return item;
    }
    public void setItem(int item) {
        this.item = item;
    }
    public Node getNextNode() {
        return nextNode;
    }
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "" + item;
    }

}
