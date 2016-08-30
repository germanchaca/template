package ar.fiuba.tdd.template;

import ar.fiuba.tdd.template.exceptions.EmptyException;

class Node<S> implements Nodeable<S> {
    private Nodeable<S> next = new EmptyNode<>();
    private S data;

    Node(S data) {
        this.data = data;
    }

    @Override
    public Nodeable<S> next() {
        return next;
    }

    public void setAtEnd(Nodeable<S> newNode, Nodeable<S> previusNode) {
        next.setAtEnd(newNode,this);
    }

    public void setNext(Nodeable<S> next) {
        this.next = next;
    }


    @Override
    public S data() {
        return data;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getTotalLinkedNodes() {
        return 1 + next.getTotalLinkedNodes();
    }
}
