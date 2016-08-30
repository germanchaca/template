package ar.fiuba.tdd.template;

import ar.fiuba.tdd.template.exceptions.EmptyException;

class LinkedList<T> {
    private Nodeable<T> headNode;

    LinkedList() {
        headNode = new FirstNode<>();
    }

    int size() {
        return headNode.getTotalLinkedNodes();
    }

    void addAtEnd(T item) throws EmptyException {
        headNode.setAtEnd(new Node<>(item),headNode);
    }

    T top() throws EmptyException {
        return headNode.data();
    }

    //elimina el primer elemento de la lista
    void remove() throws EmptyException {
        headNode.setNext(headNode.next().next());
    }

    boolean isEmpty() {
        return headNode.isEmpty();
    }
}
