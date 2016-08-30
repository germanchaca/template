package ar.fiuba.tdd.template;

import ar.fiuba.tdd.template.exceptions.EmptyException;

interface Nodeable<S> {

    Nodeable<S> next() throws EmptyException;

    Nodeable<S> getLastNotEmptyNode(Nodeable<S> previus);

    void setAtEnd(Nodeable<S> node, Nodeable<S> previus) throws EmptyException;

    void setNext(Nodeable<S> next) throws EmptyException;

    S data() throws EmptyException;

    boolean isEmpty();

    int getTotalLinkedNodes();
}
