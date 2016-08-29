package ar.fiuba.tdd.template;

import ar.fiuba.tdd.template.exceptions.EmptyException;

/**
 * Created by german on 8/29/2016.
 */
public class Queue<T> implements Queueable<T> {

    private LinkedList<T> linkedList;

    public Queue() {
        linkedList = new LinkedList<T>();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public int size() {
        return linkedList.size();
    }

    @Override
    public void add(T item) {
        linkedList.addAtEnd(item);
    }

    @Override
    public T top() throws EmptyException {
        return linkedList.top();
    }

    @Override
    public void remove() throws EmptyException {
        linkedList.remove();
    }
}
