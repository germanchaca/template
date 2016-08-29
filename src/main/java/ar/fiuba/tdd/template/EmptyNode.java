package ar.fiuba.tdd.template;

import ar.fiuba.tdd.template.exceptions.EmptyException;

/**
 * Created by german on 8/29/2016.
 */
public class EmptyNode<S> implements Nodeable<S> {

    public Nodeable<S> next() throws EmptyException {
        throw new EmptyException("El nodo está vacío");
    }

    @Override
    public void setNext(Nodeable<S> node) {
        node.setNext(this);//siempre el ultimo elemento de la lista enlazada es un nodo vacío
    }

    @Override
    public void setAtEnd(Nodeable<S> node) {
        setNext(node);
    }

    @Override
    public S data() throws EmptyException {
        throw new EmptyException("El nodo está vacío");
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int getTotalLinkedNodes() {
        return 0;
    }

}
