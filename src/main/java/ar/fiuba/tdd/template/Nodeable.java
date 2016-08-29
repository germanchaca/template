package ar.fiuba.tdd.template;

import ar.fiuba.tdd.template.exceptions.EmptyException;

/**
 * Created by german on 8/29/2016.
 */
public interface Nodeable<S> {

    Nodeable<S> next() throws EmptyException;

    Nodeable<S> setNext(Nodeable<S> next);

    Nodeable<S> setAtEnd(Nodeable<S> node, Nodeable<S> previus);

    S data() throws EmptyException;

    boolean isEmpty();

    int getTotalLinkedNodes();
}
