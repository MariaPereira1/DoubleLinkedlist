package com.School.Collections;

public class DoubleLinkedList<T> {
    private Node<T> root = null;
    private int size = 0;

    public void add(T value) {
        if (root == null) {
            this.root = new Node<>(value);
            size++;
        } else {
            Node<T> temp = this.root;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = new Node<>(value);
            temp.next.previous = temp;

            size++;
        }
    }

    public void add(int index, T value) {
        if (index > size) {
            return;
        }

        var newNode = new Node<>(value);

        if (index == 0) {
            newNode.next = this.root;
            root = newNode;
            size++;
            return;
        }

        var temp = this.root;
        int i = 0;
        while (temp.next != null &&  i++ < index) {
            temp = temp.next;
        }

        newNode.previous = temp.previous;
        newNode.next = temp;
        temp.previous.next = newNode;

        temp.previous = newNode;
        size++;

//        for (int i = 0; i < index; i++) {
//            temp = temp.next;
//        }
//
//        if (temp == null) { // its the last element so get the previous
//            temp = this.root;
//            for (int i = 0; i < index - 1; i++) {
//                temp = temp.next;
//            }
//
//            temp.next = newNode;
//            newNode.previous = temp;
//            size++;
//            return;
//        }
//
//        temp.previous.next = newNode;
//        newNode.previous = temp.previous;
//        newNode.next = temp;
//        temp.previous = newNode;
//
//
//        size++;
    }

    public T get(int index) {
        if (index > size - 1) {
            return null;
        }

        Node<T> temp = this.root;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.value;
    }

    @Override
    public String toString() {
        return root + " ";
    }

}
