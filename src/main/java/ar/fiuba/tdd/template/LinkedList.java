package ar.fiuba.tdd.template;

import ar.fiuba.tdd.template.exceptions.EmptyException;

/**
 * Created by german on 8/29/2016.
 */
public class LinkedList<T>{
    Nodeable<T> headNode;

    public LinkedList(){
        headNode = new EmptyNode();
    }

    public int size(){
        return headNode.getTotalLinkedNodes();
    }

    public void addAtEnd(T item) {
        headNode.setAtEnd(new Node<T>(item));
    }

    public T top() throws EmptyException {
        return headNode.data();
    }

    //elimina el primer elemento de la lista
    public void remove() throws EmptyException {
        headNode = headNode.next();
    }

    boolean isEmpty(){
        return headNode.isEmpty();
    }
}
