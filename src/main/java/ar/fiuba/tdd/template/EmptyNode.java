package ar.fiuba.tdd.template;

import ar.fiuba.tdd.template.exceptions.EmptyException;

class EmptyNode<S> implements Nodeable<S> {

    public Nodeable<S> next() throws EmptyException {
        throw new EmptyException("El nodo está vacío");
    }


    @Override
    public void setAtEnd(Nodeable<S> node, Nodeable<S> previus) {
        previus.setNext(node);
    }

    @Override
    public void setNext(Nodeable<S> next)  {

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
