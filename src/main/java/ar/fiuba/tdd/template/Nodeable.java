package ar.fiuba.tdd.template;

import ar.fiuba.tdd.template.exceptions.EmptyException;

interface Nodeable<S> {

    Nodeable<S> next() throws EmptyException;

    void setAtEnd(Nodeable<S> node, Nodeable<S> previus);

    void setNext(Nodeable<S> next);

    S data() throws EmptyException;

    boolean isEmpty();

    int getTotalLinkedNodes();
}
