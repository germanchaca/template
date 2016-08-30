package ar.fiuba.tdd.template;

import ar.fiuba.tdd.template.exceptions.EmptyException;

class FirstNode<S> implements Nodeable<S> {

    private Nodeable<S> next = new EmptyNode<>();

    @Override
    public Nodeable<S> next() throws EmptyException {
        return next;
    }

    @Override
    public Nodeable<S> getLastNotEmptyNode(Nodeable<S> previus) {
        return next.getLastNotEmptyNode(previus);
    }

    @Override
    public void setAtEnd(Nodeable<S> newNode, Nodeable<S> previusNode) throws EmptyException {
        getLastNotEmptyNode(previusNode).setNext(newNode);
    }

    @Override
    public void setNext(Nodeable<S> next) throws EmptyException {
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
