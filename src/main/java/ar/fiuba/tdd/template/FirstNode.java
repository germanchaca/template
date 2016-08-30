package ar.fiuba.tdd.template;

import ar.fiuba.tdd.template.exceptions.EmptyException;

class FirstNode<S> implements Nodeable<S> {

    private Nodeable<S> next = new EmptyNode<>();

    @Override
    public Nodeable<S> next() throws EmptyException {
        return next;
    }


    @Override
    public void setAtEnd(Nodeable<S> newNode, Nodeable<S> previusNode) {
        next.setAtEnd(newNode,this);
    }

    @Override
    public void setNext(Nodeable<S> next) {
        this.next = next;
    }

    @Override
    public S data() throws EmptyException {
        return next.data();
    }

    @Override
    public boolean isEmpty() {
        return next.isEmpty();
    }

    @Override
    public int getTotalLinkedNodes() {
        return next.getTotalLinkedNodes();
    }
}
